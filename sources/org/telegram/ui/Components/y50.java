package org.telegram.ui.Components;
public final class y50 {
    public final int f32874a;
    public final int f32875b;

    public y50(int i10, int i11) {
        this.f32874a = i10;
        this.f32875b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y50.class == obj.getClass()) {
            y50 y50Var = (y50) obj;
            if (this.f32874a == y50Var.f32874a && this.f32875b == y50Var.f32875b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f32874a * 31) + this.f32875b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f32874a);
        sb2.append(", ");
        return a4.a.n(this.f32875b, ")", sb2);
    }
}
