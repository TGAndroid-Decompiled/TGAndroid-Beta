package org.telegram.ui.Components;
public final class y50 {
    public final int f30161a;
    public final int f30162b;

    public y50(int i10, int i11) {
        this.f30161a = i10;
        this.f30162b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y50.class == obj.getClass()) {
            y50 y50Var = (y50) obj;
            if (this.f30161a == y50Var.f30161a && this.f30162b == y50Var.f30162b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f30161a * 31) + this.f30162b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f30161a);
        sb2.append(", ");
        return a4.a.n(this.f30162b, ")", sb2);
    }
}
