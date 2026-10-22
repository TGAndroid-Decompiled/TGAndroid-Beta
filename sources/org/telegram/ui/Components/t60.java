package org.telegram.ui.Components;
public final class t60 {
    public final int f30452a;
    public final int f30453b;

    public t60(int i10, int i11) {
        this.f30452a = i10;
        this.f30453b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t60.class == obj.getClass()) {
            t60 t60Var = (t60) obj;
            if (this.f30452a == t60Var.f30452a && this.f30453b == t60Var.f30453b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f30452a * 31) + this.f30453b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f30452a);
        sb2.append(", ");
        return a1.g.n(this.f30453b, ")", sb2);
    }
}
