package org.telegram.ui.Components;
public final class dz0 {
    public final int f25491a;
    public final int f25492b;

    public dz0(int i10, int i11) {
        this.f25491a = i10;
        this.f25492b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dz0.class != obj.getClass()) {
            return false;
        }
        dz0 dz0Var = (dz0) obj;
        if (this.f25492b == dz0Var.f25492b && this.f25491a == dz0Var.f25491a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f25491a * 31) + this.f25492b;
    }
}
