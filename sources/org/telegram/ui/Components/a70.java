package org.telegram.ui.Components;
public final class a70 {
    public final int f24617a;
    public final int f24618b;

    public a70(int i10, int i11) {
        this.f24617a = i10;
        this.f24618b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a70.class == obj.getClass()) {
            a70 a70Var = (a70) obj;
            if (this.f24617a == a70Var.f24617a && this.f24618b == a70Var.f24618b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f24617a * 31) + this.f24618b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f24617a);
        sb2.append(", ");
        return a1.g.o(this.f24618b, ")", sb2);
    }
}
