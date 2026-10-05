package org.telegram.ui.Components;
public final class m60 {
    public final int f28615a;
    public final int f28616b;

    public m60(int i10, int i11) {
        this.f28615a = i10;
        this.f28616b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m60.class == obj.getClass()) {
            m60 m60Var = (m60) obj;
            if (this.f28615a == m60Var.f28615a && this.f28616b == m60Var.f28616b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f28615a * 31) + this.f28616b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f28615a);
        sb2.append(", ");
        return a4.a.o(this.f28616b, ")", sb2);
    }
}
