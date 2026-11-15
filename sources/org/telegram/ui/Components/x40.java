package org.telegram.ui.Components;
public final class x40 {
    public final int f41566a;
    public final int f41567b;

    public x40(int i7, int i10) {
        this.f41566a = i7;
        this.f41567b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x40.class == obj.getClass()) {
            x40 x40Var = (x40) obj;
            if (this.f41566a == x40Var.f41566a && this.f41567b == x40Var.f41567b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f41566a * 31) + this.f41567b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f41566a);
        sb2.append(", ");
        return a8.p0.n(this.f41567b, ")", sb2);
    }
}
