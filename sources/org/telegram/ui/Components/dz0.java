package org.telegram.ui.Components;
public final class dz0 {
    public final int f23491a;
    public final int f23492b;

    public dz0(int i10, int i11) {
        this.f23491a = i10;
        this.f23492b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dz0.class != obj.getClass()) {
            return false;
        }
        dz0 dz0Var = (dz0) obj;
        if (this.f23492b == dz0Var.f23492b && this.f23491a == dz0Var.f23491a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f23491a * 31) + this.f23492b;
    }
}
