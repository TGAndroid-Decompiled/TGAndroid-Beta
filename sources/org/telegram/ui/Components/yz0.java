package org.telegram.ui.Components;
public final class yz0 {
    public final int f32785a;
    public final int f32786b;

    public yz0(int i10, int i11) {
        this.f32785a = i10;
        this.f32786b = i11;
    }

    public final int a() {
        return this.f32786b - this.f32785a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yz0.class != obj.getClass()) {
            return false;
        }
        yz0 yz0Var = (yz0) obj;
        if (this.f32786b == yz0Var.f32786b && this.f32785a == yz0Var.f32785a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f32785a * 31) + this.f32786b;
    }
}
