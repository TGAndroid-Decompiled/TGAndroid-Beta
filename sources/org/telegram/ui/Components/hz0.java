package org.telegram.ui.Components;
public final class hz0 {
    public final int f27669a;
    public final int f27670b;

    public hz0(int i10, int i11) {
        this.f27669a = i10;
        this.f27670b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hz0.class != obj.getClass()) {
            return false;
        }
        hz0 hz0Var = (hz0) obj;
        if (this.f27670b == hz0Var.f27670b && this.f27669a == hz0Var.f27669a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f27669a * 31) + this.f27670b;
    }
}
