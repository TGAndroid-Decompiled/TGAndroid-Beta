package org.telegram.ui.Components;
public final class x40 {
    public final int f41563a;
    public final int f41564b;

    public x40(int i7, int i10) {
        this.f41563a = i7;
        this.f41564b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x40.class == obj.getClass()) {
            x40 x40Var = (x40) obj;
            if (this.f41563a == x40Var.f41563a && this.f41564b == x40Var.f41564b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f41563a * 31) + this.f41564b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f41563a);
        sb2.append(", ");
        return a8.p0.n(this.f41564b, ")", sb2);
    }
}
