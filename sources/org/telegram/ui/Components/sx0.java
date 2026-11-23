package org.telegram.ui.Components;
public final class sx0 {
    public final int f39719a;
    public final int f39720b;

    public sx0(int i7, int i10) {
        this.f39719a = i7;
        this.f39720b = i10;
    }

    public final int a() {
        return this.f39720b - this.f39719a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sx0.class != obj.getClass()) {
            return false;
        }
        sx0 sx0Var = (sx0) obj;
        if (this.f39720b == sx0Var.f39720b && this.f39719a == sx0Var.f39719a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f39719a * 31) + this.f39720b;
    }
}
