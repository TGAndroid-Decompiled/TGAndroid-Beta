package org.telegram.ui.Components;
public final class qz0 {
    public final int f27854a;
    public final int f27855b;

    public qz0(int i10, int i11) {
        this.f27854a = i10;
        this.f27855b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qz0.class != obj.getClass()) {
            return false;
        }
        qz0 qz0Var = (qz0) obj;
        if (this.f27855b == qz0Var.f27855b && this.f27854a == qz0Var.f27854a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f27854a * 31) + this.f27855b;
    }
}
