package org.telegram.ui.Components;
public final class y50 {
    public final int f30158a;
    public final int f30159b;

    public y50(int i10, int i11) {
        this.f30158a = i10;
        this.f30159b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y50.class == obj.getClass()) {
            y50 y50Var = (y50) obj;
            if (this.f30158a == y50Var.f30158a && this.f30159b == y50Var.f30159b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f30158a * 31) + this.f30159b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f30158a);
        sb2.append(", ");
        return a4.a.o(this.f30159b, ")", sb2);
    }
}
