package org.telegram.ui.Components;
public final class gx0 {
    public final int f34034a;
    public final int f34035b;

    public gx0(int i7, int i10) {
        this.f34034a = i7;
        this.f34035b = i10;
    }

    public final int a() {
        return this.f34035b - this.f34034a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gx0.class != obj.getClass()) {
            return false;
        }
        gx0 gx0Var = (gx0) obj;
        if (this.f34035b == gx0Var.f34035b && this.f34034a == gx0Var.f34034a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f34034a * 31) + this.f34035b;
    }
}
