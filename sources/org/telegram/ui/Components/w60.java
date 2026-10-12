package org.telegram.ui.Components;
public final class w60 {
    public final int f30805a;
    public final int f30806b;

    public w60(int i10, int i11) {
        this.f30805a = i10;
        this.f30806b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w60.class == obj.getClass()) {
            w60 w60Var = (w60) obj;
            if (this.f30805a == w60Var.f30805a && this.f30806b == w60Var.f30806b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f30805a * 31) + this.f30806b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f30805a);
        sb2.append(", ");
        return a1.g.n(this.f30806b, ")", sb2);
    }
}
