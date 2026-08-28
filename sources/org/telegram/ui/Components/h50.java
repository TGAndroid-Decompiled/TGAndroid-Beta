package org.telegram.ui.Components;
public final class h50 {
    public final int f28978a;
    public final int f28979b;

    public h50(int i9, int i10) {
        this.f28978a = i9;
        this.f28979b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h50.class == obj.getClass()) {
            h50 h50Var = (h50) obj;
            if (this.f28978a == h50Var.f28978a && this.f28979b == h50Var.f28979b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f28978a * 31) + this.f28979b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f28978a);
        sb2.append(", ");
        return aa.d.l(this.f28979b, ")", sb2);
    }
}
