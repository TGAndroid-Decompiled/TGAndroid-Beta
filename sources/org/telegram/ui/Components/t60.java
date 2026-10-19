package org.telegram.ui.Components;
public final class t60 {
    public final int f30434a;
    public final int f30435b;

    public t60(int i10, int i11) {
        this.f30434a = i10;
        this.f30435b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t60.class == obj.getClass()) {
            t60 t60Var = (t60) obj;
            if (this.f30434a == t60Var.f30434a && this.f30435b == t60Var.f30435b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f30434a * 31) + this.f30435b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f30434a);
        sb2.append(", ");
        return a1.g.n(this.f30435b, ")", sb2);
    }
}
