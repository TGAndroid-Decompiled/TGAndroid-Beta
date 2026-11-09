package org.telegram.ui.Components;
public final class hx0 {
    public final int f34403a;
    public final int f34404b;

    public hx0(int i7, int i10) {
        this.f34403a = i7;
        this.f34404b = i10;
    }

    public final int a() {
        return this.f34404b - this.f34403a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hx0.class != obj.getClass()) {
            return false;
        }
        hx0 hx0Var = (hx0) obj;
        if (this.f34404b == hx0Var.f34404b && this.f34403a == hx0Var.f34403a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f34403a * 31) + this.f34404b;
    }
}
