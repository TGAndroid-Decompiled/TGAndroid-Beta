package org.telegram.ui.Components;
public final class m60 {
    public final int f28534a;
    public final int f28535b;

    public m60(int i10, int i11) {
        this.f28534a = i10;
        this.f28535b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m60.class == obj.getClass()) {
            m60 m60Var = (m60) obj;
            if (this.f28534a == m60Var.f28534a && this.f28535b == m60Var.f28535b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f28534a * 31) + this.f28535b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f28534a);
        sb2.append(", ");
        return a4.a.n(this.f28535b, ")", sb2);
    }
}
