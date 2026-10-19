package org.telegram.ui.Components;
public final class yz0 {
    public final int f32787a;
    public final int f32788b;

    public yz0(int i10, int i11) {
        this.f32787a = i10;
        this.f32788b = i11;
    }

    public final int a() {
        return this.f32788b - this.f32787a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yz0.class != obj.getClass()) {
            return false;
        }
        yz0 yz0Var = (yz0) obj;
        if (this.f32788b == yz0Var.f32788b && this.f32787a == yz0Var.f32787a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f32787a * 31) + this.f32788b;
    }
}
