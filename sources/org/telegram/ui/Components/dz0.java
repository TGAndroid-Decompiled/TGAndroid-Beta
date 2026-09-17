package org.telegram.ui.Components;
public final class dz0 {
    public final int f25519a;
    public final int f25520b;

    public dz0(int i10, int i11) {
        this.f25519a = i10;
        this.f25520b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dz0.class != obj.getClass()) {
            return false;
        }
        dz0 dz0Var = (dz0) obj;
        if (this.f25520b == dz0Var.f25520b && this.f25519a == dz0Var.f25519a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f25519a * 31) + this.f25520b;
    }
}
