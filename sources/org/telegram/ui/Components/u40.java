package org.telegram.ui.Components;
public final class u40 {
    public final int f38496a;
    public final int f38497b;

    public u40(int i7, int i10) {
        this.f38496a = i7;
        this.f38497b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u40.class == obj.getClass()) {
            u40 u40Var = (u40) obj;
            if (this.f38496a == u40Var.f38496a && this.f38497b == u40Var.f38497b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f38496a * 31) + this.f38497b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f38496a);
        sb2.append(", ");
        return a8.p0.n(this.f38497b, ")", sb2);
    }
}
