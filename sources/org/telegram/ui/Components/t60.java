package org.telegram.ui.Components;
public final class t60 {
    public final int f30483a;
    public final int f30484b;

    public t60(int i10, int i11) {
        this.f30483a = i10;
        this.f30484b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t60.class == obj.getClass()) {
            t60 t60Var = (t60) obj;
            if (this.f30483a == t60Var.f30483a && this.f30484b == t60Var.f30484b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f30483a * 31) + this.f30484b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f30483a);
        sb2.append(", ");
        return a1.g.n(this.f30484b, ")", sb2);
    }
}
