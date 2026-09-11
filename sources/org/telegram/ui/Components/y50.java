package org.telegram.ui.Components;
public final class y50 {
    public final int f32847a;
    public final int f32848b;

    public y50(int i10, int i11) {
        this.f32847a = i10;
        this.f32848b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y50.class == obj.getClass()) {
            y50 y50Var = (y50) obj;
            if (this.f32847a == y50Var.f32847a && this.f32848b == y50Var.f32848b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f32847a * 31) + this.f32848b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntSize(");
        sb2.append(this.f32847a);
        sb2.append(", ");
        return a4.a.n(this.f32848b, ")", sb2);
    }
}
