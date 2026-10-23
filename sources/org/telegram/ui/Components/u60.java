package org.telegram.ui.Components;
public final class u60 {
    public final int f31090a;
    public final int f31091b;

    public u60(int i10, int i11) {
        this.f31090a = i10;
        this.f31091b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u60.class == obj.getClass()) {
            u60 u60Var = (u60) obj;
            if (this.f31090a == u60Var.f31090a && this.f31091b == u60Var.f31091b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f31090a * 31) + this.f31091b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f31090a);
        sb2.append(", ");
        return a1.g.n(this.f31091b, ")", sb2);
    }
}
