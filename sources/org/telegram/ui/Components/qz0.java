package org.telegram.ui.Components;
public final class qz0 {
    public final int f27853a;
    public final int f27854b;

    public qz0(int i10, int i11) {
        this.f27853a = i10;
        this.f27854b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qz0.class != obj.getClass()) {
            return false;
        }
        qz0 qz0Var = (qz0) obj;
        if (this.f27854b == qz0Var.f27854b && this.f27853a == qz0Var.f27853a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f27853a * 31) + this.f27854b;
    }
}
