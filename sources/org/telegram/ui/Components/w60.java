package org.telegram.ui.Components;
public final class w60 {
    public final int f30482a;
    public final int f30483b;

    public w60(int i10, int i11) {
        this.f30482a = i10;
        this.f30483b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w60.class == obj.getClass()) {
            w60 w60Var = (w60) obj;
            if (this.f30482a == w60Var.f30482a && this.f30483b == w60Var.f30483b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f30482a * 31) + this.f30483b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f30482a);
        sb2.append(", ");
        return a1.g.n(this.f30483b, ")", sb2);
    }
}
