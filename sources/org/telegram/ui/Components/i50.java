package org.telegram.ui.Components;
public final class i50 {
    public final int f36098a;
    public final int f36099b;

    public i50(int i7, int i10) {
        this.f36098a = i7;
        this.f36099b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i50.class == obj.getClass()) {
            i50 i50Var = (i50) obj;
            if (this.f36098a == i50Var.f36098a && this.f36099b == i50Var.f36099b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f36098a * 31) + this.f36099b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f36098a);
        sb2.append(", ");
        return a8.p0.n(this.f36099b, ")", sb2);
    }
}
