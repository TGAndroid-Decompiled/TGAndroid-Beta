package org.telegram.ui.Components;
public final class gx0 {
    public final int f34004a;
    public final int f34005b;

    public gx0(int i7, int i10) {
        this.f34004a = i7;
        this.f34005b = i10;
    }

    public final int a() {
        return this.f34005b - this.f34004a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gx0.class != obj.getClass()) {
            return false;
        }
        gx0 gx0Var = (gx0) obj;
        if (this.f34005b == gx0Var.f34005b && this.f34004a == gx0Var.f34004a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f34004a * 31) + this.f34005b;
    }
}
