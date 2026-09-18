package org.telegram.ui.Components;
public final class qz0 {
    public final int f27759a;
    public final int f27760b;

    public qz0(int i10, int i11) {
        this.f27759a = i10;
        this.f27760b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qz0.class != obj.getClass()) {
            return false;
        }
        qz0 qz0Var = (qz0) obj;
        if (this.f27760b == qz0Var.f27760b && this.f27759a == qz0Var.f27759a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f27759a * 31) + this.f27760b;
    }
}
