package org.telegram.ui.Components;
public final class i50 {
    public final int f36150a;
    public final int f36151b;

    public i50(int i7, int i10) {
        this.f36150a = i7;
        this.f36151b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i50.class == obj.getClass()) {
            i50 i50Var = (i50) obj;
            if (this.f36150a == i50Var.f36150a && this.f36151b == i50Var.f36151b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f36150a * 31) + this.f36151b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f36150a);
        sb2.append(", ");
        return a8.p0.n(this.f36151b, ")", sb2);
    }
}
