package org.telegram.ui.Components;
public final class pz0 {
    public final int f27469a;
    public final int f27470b;

    public pz0(int i10, int i11) {
        this.f27469a = i10;
        this.f27470b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pz0.class != obj.getClass()) {
            return false;
        }
        pz0 pz0Var = (pz0) obj;
        if (this.f27470b == pz0Var.f27470b && this.f27469a == pz0Var.f27469a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f27469a * 31) + this.f27470b;
    }
}
