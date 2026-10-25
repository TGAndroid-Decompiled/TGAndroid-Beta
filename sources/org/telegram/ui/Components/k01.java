package org.telegram.ui.Components;
public final class k01 {
    public final int f29765a;
    public final int f29766b;

    public k01(int i10, int i11) {
        this.f29765a = i10;
        this.f29766b = i11;
    }

    public final int a() {
        return this.f29766b - this.f29765a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k01.class != obj.getClass()) {
            return false;
        }
        k01 k01Var = (k01) obj;
        if (this.f29766b == k01Var.f29766b && this.f29765a == k01Var.f29765a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f29765a * 31) + this.f29766b;
    }
}
