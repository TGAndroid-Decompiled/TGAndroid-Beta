package org.telegram.ui.Components;
public final class b01 {
    public final int f24861a;
    public final int f24862b;

    public b01(int i10, int i11) {
        this.f24861a = i10;
        this.f24862b = i11;
    }

    public final int a() {
        return this.f24862b - this.f24861a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b01.class != obj.getClass()) {
            return false;
        }
        b01 b01Var = (b01) obj;
        if (this.f24862b == b01Var.f24862b && this.f24861a == b01Var.f24861a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f24861a * 31) + this.f24862b;
    }
}
