package org.telegram.ui.Components;
public final class y50 {
    public final int f30127a;
    public final int f30128b;

    public y50(int i10, int i11) {
        this.f30127a = i10;
        this.f30128b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y50.class == obj.getClass()) {
            y50 y50Var = (y50) obj;
            if (this.f30127a == y50Var.f30127a && this.f30128b == y50Var.f30128b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f30127a * 31) + this.f30128b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f30127a);
        sb2.append(", ");
        return a4.a.n(this.f30128b, ")", sb2);
    }
}
