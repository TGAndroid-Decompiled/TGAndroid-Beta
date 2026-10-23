package org.telegram.ui.Components;
public final class c01 {
    public final int f25190a;
    public final int f25191b;

    public c01(int i10, int i11) {
        this.f25190a = i10;
        this.f25191b = i11;
    }

    public final int a() {
        return this.f25191b - this.f25190a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c01.class != obj.getClass()) {
            return false;
        }
        c01 c01Var = (c01) obj;
        if (this.f25191b == c01Var.f25191b && this.f25190a == c01Var.f25190a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f25190a * 31) + this.f25191b;
    }
}
