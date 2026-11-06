package org.telegram.ui.Components;
public final class u40 {
    public final int f38497a;
    public final int f38498b;

    public u40(int i7, int i10) {
        this.f38497a = i7;
        this.f38498b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u40.class == obj.getClass()) {
            u40 u40Var = (u40) obj;
            if (this.f38497a == u40Var.f38497a && this.f38498b == u40Var.f38498b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f38497a * 31) + this.f38498b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f38497a);
        sb2.append(", ");
        return a8.p0.n(this.f38498b, ")", sb2);
    }
}
