package com.binhcodev.todo_list.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegisterDto {
    private String email;
    private String password;
}
