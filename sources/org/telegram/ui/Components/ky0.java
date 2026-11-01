package org.telegram.ui.Components;
public final class ky0 {
    public final int f27987a;
    public final int f27988b;

    public ky0(int i10, int i11) {
        this.f27987a = i10;
        this.f27988b = i11;
    }

    public final int a() {
        return this.f27988b - this.f27987a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ky0.class != obj.getClass()) {
            return false;
        }
        ky0 ky0Var = (ky0) obj;
        if (this.f27988b == ky0Var.f27988b && this.f27987a == ky0Var.f27987a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f27987a * 31) + this.f27988b;
    }
}
