package org.telegram.ui.Components;
public final class f50 {
    public final int f35010a;
    public final int f35011b;

    public f50(int i7, int i10) {
        this.f35010a = i7;
        this.f35011b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f50.class == obj.getClass()) {
            f50 f50Var = (f50) obj;
            if (this.f35010a == f50Var.f35010a && this.f35011b == f50Var.f35011b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f35010a * 31) + this.f35011b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f35010a);
        sb2.append(", ");
        return a8.p0.n(this.f35011b, ")", sb2);
    }
}
