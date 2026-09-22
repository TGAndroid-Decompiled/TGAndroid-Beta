package org.telegram.ui.Components;
public final class rz0 {
    public final int f28076a;
    public final int f28077b;

    public rz0(int i10, int i11) {
        this.f28076a = i10;
        this.f28077b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rz0.class != obj.getClass()) {
            return false;
        }
        rz0 rz0Var = (rz0) obj;
        if (this.f28077b == rz0Var.f28077b && this.f28076a == rz0Var.f28076a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f28076a * 31) + this.f28077b;
    }
}
