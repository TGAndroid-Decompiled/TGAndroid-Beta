package org.telegram.ui.Components;
public final class fz0 {
    public final int f24042a;
    public final int f24043b;

    public fz0(int i10, int i11) {
        this.f24042a = i10;
        this.f24043b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fz0.class != obj.getClass()) {
            return false;
        }
        fz0 fz0Var = (fz0) obj;
        if (this.f24043b == fz0Var.f24043b && this.f24042a == fz0Var.f24042a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f24042a * 31) + this.f24043b;
    }
}
