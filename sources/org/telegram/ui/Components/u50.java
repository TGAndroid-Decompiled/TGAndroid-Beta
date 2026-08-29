package org.telegram.ui.Components;
public final class u50 {
    public final int f33142a;
    public final int f33143b;

    public u50(int i10, int i11) {
        this.f33142a = i10;
        this.f33143b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u50.class == obj.getClass()) {
            u50 u50Var = (u50) obj;
            if (this.f33142a == u50Var.f33142a && this.f33143b == u50Var.f33143b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f33142a * 31) + this.f33143b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f33142a);
        sb2.append(", ");
        return a4.w.l(this.f33143b, ")", sb2);
    }
}
