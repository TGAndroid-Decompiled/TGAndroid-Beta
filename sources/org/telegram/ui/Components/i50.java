package org.telegram.ui.Components;
public final class i50 {
    public final int f36143a;
    public final int f36144b;

    public i50(int i7, int i10) {
        this.f36143a = i7;
        this.f36144b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i50.class == obj.getClass()) {
            i50 i50Var = (i50) obj;
            if (this.f36143a == i50Var.f36143a && this.f36144b == i50Var.f36144b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f36143a * 31) + this.f36144b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f36143a);
        sb2.append(", ");
        return a8.p0.n(this.f36144b, ")", sb2);
    }
}
