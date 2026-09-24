package org.telegram.ui.Components;
public final class oz0 {
    public final int f27205a;
    public final int f27206b;

    public oz0(int i10, int i11) {
        this.f27205a = i10;
        this.f27206b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oz0.class != obj.getClass()) {
            return false;
        }
        oz0 oz0Var = (oz0) obj;
        if (this.f27206b == oz0Var.f27206b && this.f27205a == oz0Var.f27205a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f27205a * 31) + this.f27206b;
    }
}
