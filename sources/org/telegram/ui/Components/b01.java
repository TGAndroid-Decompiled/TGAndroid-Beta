package org.telegram.ui.Components;
public final class b01 {
    public final int f23663a;
    public final int f23664b;

    public b01(int i10, int i11) {
        this.f23663a = i10;
        this.f23664b = i11;
    }

    public final int a() {
        return this.f23664b - this.f23663a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b01.class != obj.getClass()) {
            return false;
        }
        b01 b01Var = (b01) obj;
        if (this.f23664b == b01Var.f23664b && this.f23663a == b01Var.f23663a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f23663a * 31) + this.f23664b;
    }
}
