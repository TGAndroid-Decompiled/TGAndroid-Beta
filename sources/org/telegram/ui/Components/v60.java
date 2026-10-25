package org.telegram.ui.Components;
public final class v60 {
    public final int f33581a;
    public final int f33582b;

    public v60(int i10, int i11) {
        this.f33581a = i10;
        this.f33582b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v60.class == obj.getClass()) {
            v60 v60Var = (v60) obj;
            if (this.f33581a == v60Var.f33581a && this.f33582b == v60Var.f33582b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f33581a * 31) + this.f33582b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f33581a);
        sb2.append(", ");
        return a1.g.n(this.f33582b, ")", sb2);
    }
}
