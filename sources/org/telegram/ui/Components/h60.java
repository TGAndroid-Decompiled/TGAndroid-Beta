package org.telegram.ui.Components;
public final class h60 {
    public final int f23527a;
    public final int f23528b;

    public h60(int i10, int i11) {
        this.f23527a = i10;
        this.f23528b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h60.class == obj.getClass()) {
            h60 h60Var = (h60) obj;
            if (this.f23527a == h60Var.f23527a && this.f23528b == h60Var.f23528b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f23527a * 31) + this.f23528b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f23527a);
        sb2.append(", ");
        return a4.a.n(this.f23528b, ")", sb2);
    }
}
