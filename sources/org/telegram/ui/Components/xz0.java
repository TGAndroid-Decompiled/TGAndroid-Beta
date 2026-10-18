package org.telegram.ui.Components;
public final class xz0 {
    public final int f32487a;
    public final int f32488b;

    public xz0(int i10, int i11) {
        this.f32487a = i10;
        this.f32488b = i11;
    }

    public final int a() {
        return this.f32488b - this.f32487a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xz0.class != obj.getClass()) {
            return false;
        }
        xz0 xz0Var = (xz0) obj;
        if (this.f32488b == xz0Var.f32488b && this.f32487a == xz0Var.f32487a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f32487a * 31) + this.f32488b;
    }
}
