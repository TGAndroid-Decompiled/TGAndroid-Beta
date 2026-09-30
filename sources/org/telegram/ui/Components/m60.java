package org.telegram.ui.Components;
public final class m60 {
    public final int f26219a;
    public final int f26220b;

    public m60(int i10, int i11) {
        this.f26219a = i10;
        this.f26220b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m60.class == obj.getClass()) {
            m60 m60Var = (m60) obj;
            if (this.f26219a == m60Var.f26219a && this.f26220b == m60Var.f26220b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f26219a * 31) + this.f26220b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f26219a);
        sb2.append(", ");
        return a4.a.o(this.f26220b, ")", sb2);
    }
}
