package org.telegram.ui.Components;
public final class t60 {
    public final int f30476a;
    public final int f30477b;

    public t60(int i10, int i11) {
        this.f30476a = i10;
        this.f30477b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t60.class == obj.getClass()) {
            t60 t60Var = (t60) obj;
            if (this.f30476a == t60Var.f30476a && this.f30477b == t60Var.f30477b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f30476a * 31) + this.f30477b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f30476a);
        sb2.append(", ");
        return a1.g.n(this.f30477b, ")", sb2);
    }
}
