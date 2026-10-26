package org.telegram.ui.Components;
public final class v60 {
    public final int f33584a;
    public final int f33585b;

    public v60(int i10, int i11) {
        this.f33584a = i10;
        this.f33585b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v60.class == obj.getClass()) {
            v60 v60Var = (v60) obj;
            if (this.f33584a == v60Var.f33584a && this.f33585b == v60Var.f33585b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f33584a * 31) + this.f33585b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f33584a);
        sb2.append(", ");
        return a1.g.n(this.f33585b, ")", sb2);
    }
}
