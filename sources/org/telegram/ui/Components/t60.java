package org.telegram.ui.Components;
public final class t60 {
    public final int f30432a;
    public final int f30433b;

    public t60(int i10, int i11) {
        this.f30432a = i10;
        this.f30433b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t60.class == obj.getClass()) {
            t60 t60Var = (t60) obj;
            if (this.f30432a == t60Var.f30432a && this.f30433b == t60Var.f30433b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f30432a * 31) + this.f30433b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f30432a);
        sb2.append(", ");
        return a1.g.n(this.f30433b, ")", sb2);
    }
}
