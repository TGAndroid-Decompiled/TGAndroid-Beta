package org.telegram.ui.Components;
public final class gx0 {
    public final int f34020a;
    public final int f34021b;

    public gx0(int i7, int i10) {
        this.f34020a = i7;
        this.f34021b = i10;
    }

    public final int a() {
        return this.f34021b - this.f34020a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gx0.class != obj.getClass()) {
            return false;
        }
        gx0 gx0Var = (gx0) obj;
        if (this.f34021b == gx0Var.f34021b && this.f34020a == gx0Var.f34020a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f34020a * 31) + this.f34021b;
    }
}
