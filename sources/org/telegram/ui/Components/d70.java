package org.telegram.ui.Components;
public final class d70 {
    public final int f25258a;
    public final int f25259b;

    public d70(int i10, int i11) {
        this.f25258a = i10;
        this.f25259b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d70.class == obj.getClass()) {
            d70 d70Var = (d70) obj;
            if (this.f25258a == d70Var.f25258a && this.f25259b == d70Var.f25259b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f25258a * 31) + this.f25259b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f25258a);
        sb2.append(", ");
        return a1.g.o(this.f25259b, ")", sb2);
    }
}
