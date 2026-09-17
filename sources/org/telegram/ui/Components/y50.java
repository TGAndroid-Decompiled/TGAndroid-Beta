package org.telegram.ui.Components;
public final class y50 {
    public final int f30124a;
    public final int f30125b;

    public y50(int i10, int i11) {
        this.f30124a = i10;
        this.f30125b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y50.class == obj.getClass()) {
            y50 y50Var = (y50) obj;
            if (this.f30124a == y50Var.f30124a && this.f30125b == y50Var.f30125b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f30124a * 31) + this.f30125b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f30124a);
        sb2.append(", ");
        return a4.a.n(this.f30125b, ")", sb2);
    }
}
