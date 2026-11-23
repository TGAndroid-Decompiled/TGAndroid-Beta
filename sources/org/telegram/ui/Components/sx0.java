package org.telegram.ui.Components;
public final class sx0 {
    public final int f39718a;
    public final int f39719b;

    public sx0(int i7, int i10) {
        this.f39718a = i7;
        this.f39719b = i10;
    }

    public final int a() {
        return this.f39719b - this.f39718a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sx0.class != obj.getClass()) {
            return false;
        }
        sx0 sx0Var = (sx0) obj;
        if (this.f39719b == sx0Var.f39719b && this.f39718a == sx0Var.f39718a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f39718a * 31) + this.f39719b;
    }
}
