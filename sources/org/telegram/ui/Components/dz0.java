package org.telegram.ui.Components;
public final class dz0 {
    public final int f25492a;
    public final int f25493b;

    public dz0(int i10, int i11) {
        this.f25492a = i10;
        this.f25493b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dz0.class != obj.getClass()) {
            return false;
        }
        dz0 dz0Var = (dz0) obj;
        if (this.f25493b == dz0Var.f25493b && this.f25492a == dz0Var.f25492a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f25492a * 31) + this.f25493b;
    }
}
