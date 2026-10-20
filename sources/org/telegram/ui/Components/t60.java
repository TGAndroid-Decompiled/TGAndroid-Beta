package org.telegram.ui.Components;
public final class t60 {
    public final int f30448a;
    public final int f30449b;

    public t60(int i10, int i11) {
        this.f30448a = i10;
        this.f30449b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t60.class == obj.getClass()) {
            t60 t60Var = (t60) obj;
            if (this.f30448a == t60Var.f30448a && this.f30449b == t60Var.f30449b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f30448a * 31) + this.f30449b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f30448a);
        sb2.append(", ");
        return a1.g.n(this.f30449b, ")", sb2);
    }
}
