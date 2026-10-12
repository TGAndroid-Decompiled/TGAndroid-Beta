package org.telegram.ui.Components;
public final class l01 {
    public final int f27969a;
    public final int f27970b;

    public l01(int i10, int i11) {
        this.f27969a = i10;
        this.f27970b = i11;
    }

    public final int a() {
        return this.f27970b - this.f27969a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l01.class != obj.getClass()) {
            return false;
        }
        l01 l01Var = (l01) obj;
        if (this.f27970b == l01Var.f27970b && this.f27969a == l01Var.f27969a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f27969a * 31) + this.f27970b;
    }
}
