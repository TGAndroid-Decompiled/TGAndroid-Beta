package org.telegram.ui.Components;
public final class rz0 {
    public final int f28150a;
    public final int f28151b;

    public rz0(int i10, int i11) {
        this.f28150a = i10;
        this.f28151b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rz0.class != obj.getClass()) {
            return false;
        }
        rz0 rz0Var = (rz0) obj;
        if (this.f28151b == rz0Var.f28151b && this.f28150a == rz0Var.f28150a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f28150a * 31) + this.f28151b;
    }
}
