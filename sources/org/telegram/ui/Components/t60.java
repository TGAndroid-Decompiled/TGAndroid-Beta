package org.telegram.ui.Components;
public final class t60 {
    public final int f30453a;
    public final int f30454b;

    public t60(int i10, int i11) {
        this.f30453a = i10;
        this.f30454b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t60.class == obj.getClass()) {
            t60 t60Var = (t60) obj;
            if (this.f30453a == t60Var.f30453a && this.f30454b == t60Var.f30454b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f30453a * 31) + this.f30454b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f30453a);
        sb2.append(", ");
        return a1.g.n(this.f30454b, ")", sb2);
    }
}
