package org.telegram.ui.Components;
public final class h01 {
    public final int f26868a;
    public final int f26869b;

    public h01(int i10, int i11) {
        this.f26868a = i10;
        this.f26869b = i11;
    }

    public final int a() {
        return this.f26869b - this.f26868a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h01.class != obj.getClass()) {
            return false;
        }
        h01 h01Var = (h01) obj;
        if (this.f26869b == h01Var.f26869b && this.f26868a == h01Var.f26868a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f26868a * 31) + this.f26869b;
    }
}
