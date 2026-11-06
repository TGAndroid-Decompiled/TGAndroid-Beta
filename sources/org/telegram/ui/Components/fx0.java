package org.telegram.ui.Components;
public final class fx0 {
    public final int f33653a;
    public final int f33654b;

    public fx0(int i7, int i10) {
        this.f33653a = i7;
        this.f33654b = i10;
    }

    public final int a() {
        return this.f33654b - this.f33653a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fx0.class != obj.getClass()) {
            return false;
        }
        fx0 fx0Var = (fx0) obj;
        if (this.f33654b == fx0Var.f33654b && this.f33653a == fx0Var.f33653a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f33653a * 31) + this.f33654b;
    }
}
