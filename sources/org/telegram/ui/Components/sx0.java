package org.telegram.ui.Components;
public final class sx0 {
    public final int f39673a;
    public final int f39674b;

    public sx0(int i7, int i10) {
        this.f39673a = i7;
        this.f39674b = i10;
    }

    public final int a() {
        return this.f39674b - this.f39673a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sx0.class != obj.getClass()) {
            return false;
        }
        sx0 sx0Var = (sx0) obj;
        if (this.f39674b == sx0Var.f39674b && this.f39673a == sx0Var.f39673a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f39673a * 31) + this.f39674b;
    }
}
