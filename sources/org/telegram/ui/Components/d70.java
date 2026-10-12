package org.telegram.ui.Components;
public final class d70 {
    public final int f25250a;
    public final int f25251b;

    public d70(int i10, int i11) {
        this.f25250a = i10;
        this.f25251b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d70.class == obj.getClass()) {
            d70 d70Var = (d70) obj;
            if (this.f25250a == d70Var.f25250a && this.f25251b == d70Var.f25251b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f25250a * 31) + this.f25251b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f25250a);
        sb2.append(", ");
        return a1.g.o(this.f25251b, ")", sb2);
    }
}
