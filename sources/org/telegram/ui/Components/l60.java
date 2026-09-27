package org.telegram.ui.Components;
public final class l60 {
    public final int f25955a;
    public final int f25956b;

    public l60(int i10, int i11) {
        this.f25955a = i10;
        this.f25956b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l60.class == obj.getClass()) {
            l60 l60Var = (l60) obj;
            if (this.f25955a == l60Var.f25955a && this.f25956b == l60Var.f25956b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f25955a * 31) + this.f25956b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f25955a);
        sb2.append(", ");
        return a4.a.n(this.f25956b, ")", sb2);
    }
}
