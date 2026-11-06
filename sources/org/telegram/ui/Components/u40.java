package org.telegram.ui.Components;
public final class u40 {
    public final int f38519a;
    public final int f38520b;

    public u40(int i7, int i10) {
        this.f38519a = i7;
        this.f38520b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u40.class == obj.getClass()) {
            u40 u40Var = (u40) obj;
            if (this.f38519a == u40Var.f38519a && this.f38520b == u40Var.f38520b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f38519a * 31) + this.f38520b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f38519a);
        sb2.append(", ");
        return a8.p0.n(this.f38520b, ")", sb2);
    }
}
