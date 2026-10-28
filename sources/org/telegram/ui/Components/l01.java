package org.telegram.ui.Components;
public final class l01 {
    public final int f30077a;
    public final int f30078b;

    public l01(int i10, int i11) {
        this.f30077a = i10;
        this.f30078b = i11;
    }

    public final int a() {
        return this.f30078b - this.f30077a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l01.class != obj.getClass()) {
            return false;
        }
        l01 l01Var = (l01) obj;
        if (this.f30078b == l01Var.f30078b && this.f30077a == l01Var.f30077a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f30077a * 31) + this.f30078b;
    }
}
