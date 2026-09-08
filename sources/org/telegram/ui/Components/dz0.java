package org.telegram.ui.Components;
public final class dz0 {
    public final int f25518a;
    public final int f25519b;

    public dz0(int i10, int i11) {
        this.f25518a = i10;
        this.f25519b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dz0.class != obj.getClass()) {
            return false;
        }
        dz0 dz0Var = (dz0) obj;
        if (this.f25519b == dz0Var.f25519b && this.f25518a == dz0Var.f25518a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f25518a * 31) + this.f25519b;
    }
}
