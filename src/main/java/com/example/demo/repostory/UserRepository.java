package com.example.demo.repostory;

import com.example.demo.modell.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<Object> findByUsername(String username);

}