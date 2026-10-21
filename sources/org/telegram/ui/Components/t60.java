package org.telegram.ui.Components;
public final class t60 {
    public final int f30449a;
    public final int f30450b;

    public t60(int i10, int i11) {
        this.f30449a = i10;
        this.f30450b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t60.class == obj.getClass()) {
            t60 t60Var = (t60) obj;
            if (this.f30449a == t60Var.f30449a && this.f30450b == t60Var.f30450b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f30449a * 31) + this.f30450b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f30449a);
        sb2.append(", ");
        return a1.g.n(this.f30450b, ")", sb2);
    }
}
