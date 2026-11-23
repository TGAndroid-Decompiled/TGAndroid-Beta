package org.telegram.ui.Components;
public final class i50 {
    public final int f36144a;
    public final int f36145b;

    public i50(int i7, int i10) {
        this.f36144a = i7;
        this.f36145b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i50.class == obj.getClass()) {
            i50 i50Var = (i50) obj;
            if (this.f36144a == i50Var.f36144a && this.f36145b == i50Var.f36145b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f36144a * 31) + this.f36145b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f36144a);
        sb2.append(", ");
        return a8.p0.n(this.f36145b, ")", sb2);
    }
}
