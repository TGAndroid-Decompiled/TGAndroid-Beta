package org.telegram.ui.Components;
public final class y50 {
    public final int f32875a;
    public final int f32876b;

    public y50(int i10, int i11) {
        this.f32875a = i10;
        this.f32876b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y50.class == obj.getClass()) {
            y50 y50Var = (y50) obj;
            if (this.f32875a == y50Var.f32875a && this.f32876b == y50Var.f32876b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f32875a * 31) + this.f32876b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f32875a);
        sb2.append(", ");
        return a4.a.n(this.f32876b, ")", sb2);
    }
}
