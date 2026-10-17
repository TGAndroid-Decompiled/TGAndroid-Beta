package org.telegram.ui.Components;
public final class xz0 {
    public final int f32480a;
    public final int f32481b;

    public xz0(int i10, int i11) {
        this.f32480a = i10;
        this.f32481b = i11;
    }

    public final int a() {
        return this.f32481b - this.f32480a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xz0.class != obj.getClass()) {
            return false;
        }
        xz0 xz0Var = (xz0) obj;
        if (this.f32481b == xz0Var.f32481b && this.f32480a == xz0Var.f32480a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f32480a * 31) + this.f32481b;
    }
}
