package org.telegram.ui.Components;
public final class c01 {
    public final int f23601a;
    public final int f23602b;

    public c01(int i10, int i11) {
        this.f23601a = i10;
        this.f23602b = i11;
    }

    public final int a() {
        return this.f23602b - this.f23601a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c01.class != obj.getClass()) {
            return false;
        }
        c01 c01Var = (c01) obj;
        if (this.f23602b == c01Var.f23602b && this.f23601a == c01Var.f23601a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f23601a * 31) + this.f23602b;
    }
}
