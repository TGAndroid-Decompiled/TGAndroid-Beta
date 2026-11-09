package org.telegram.ui.Components;
public final class v40 {
    public final int f38914a;
    public final int f38915b;

    public v40(int i7, int i10) {
        this.f38914a = i7;
        this.f38915b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v40.class == obj.getClass()) {
            v40 v40Var = (v40) obj;
            if (this.f38914a == v40Var.f38914a && this.f38915b == v40Var.f38915b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f38914a * 31) + this.f38915b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f38914a);
        sb2.append(", ");
        return a8.p0.n(this.f38915b, ")", sb2);
    }
}
