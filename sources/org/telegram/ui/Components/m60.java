package org.telegram.ui.Components;
public final class m60 {
    public final int f28535a;
    public final int f28536b;

    public m60(int i10, int i11) {
        this.f28535a = i10;
        this.f28536b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m60.class == obj.getClass()) {
            m60 m60Var = (m60) obj;
            if (this.f28535a == m60Var.f28535a && this.f28536b == m60Var.f28536b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f28535a * 31) + this.f28536b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f28535a);
        sb2.append(", ");
        return a4.a.n(this.f28536b, ")", sb2);
    }
}
