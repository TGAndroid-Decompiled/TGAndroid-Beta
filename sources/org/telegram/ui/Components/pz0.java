package org.telegram.ui.Components;
public final class pz0 {
    public final int f27524a;
    public final int f27525b;

    public pz0(int i10, int i11) {
        this.f27524a = i10;
        this.f27525b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pz0.class != obj.getClass()) {
            return false;
        }
        pz0 pz0Var = (pz0) obj;
        if (this.f27525b == pz0Var.f27525b && this.f27524a == pz0Var.f27524a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f27524a * 31) + this.f27525b;
    }
}
