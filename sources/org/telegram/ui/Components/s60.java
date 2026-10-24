package org.telegram.ui.Components;
public final class s60 {
    public final int f30454a;
    public final int f30455b;

    public s60(int i10, int i11) {
        this.f30454a = i10;
        this.f30455b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s60.class == obj.getClass()) {
            s60 s60Var = (s60) obj;
            if (this.f30454a == s60Var.f30454a && this.f30455b == s60Var.f30455b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f30454a * 31) + this.f30455b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f30454a);
        sb2.append(", ");
        return a1.g.n(this.f30455b, ")", sb2);
    }
}
