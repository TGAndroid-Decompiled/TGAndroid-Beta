package org.telegram.ui.Components;
public final class m60 {
    public final int f28540a;
    public final int f28541b;

    public m60(int i10, int i11) {
        this.f28540a = i10;
        this.f28541b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m60.class == obj.getClass()) {
            m60 m60Var = (m60) obj;
            if (this.f28540a == m60Var.f28540a && this.f28541b == m60Var.f28541b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f28540a * 31) + this.f28541b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f28540a);
        sb2.append(", ");
        return a4.a.o(this.f28541b, ")", sb2);
    }
}
