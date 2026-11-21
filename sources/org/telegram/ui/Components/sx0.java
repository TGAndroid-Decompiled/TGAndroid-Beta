package org.telegram.ui.Components;
public final class sx0 {
    public final int f39726a;
    public final int f39727b;

    public sx0(int i7, int i10) {
        this.f39726a = i7;
        this.f39727b = i10;
    }

    public final int a() {
        return this.f39727b - this.f39726a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sx0.class != obj.getClass()) {
            return false;
        }
        sx0 sx0Var = (sx0) obj;
        if (this.f39727b == sx0Var.f39727b && this.f39726a == sx0Var.f39726a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f39726a * 31) + this.f39727b;
    }
}
