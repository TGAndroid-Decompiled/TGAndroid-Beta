package org.telegram.ui.Components;
public final class b01 {
    public static final b01 e = new b01(false, new yz0(Integer.MIN_VALUE, -2147483647), e01.R, 0.0f);
    public final boolean f24760a;
    public final yz0 f24761b;
    public final qz0 f24762c;
    public final float d;

    public b01(boolean z10, yz0 yz0Var, qz0 qz0Var, float f7) {
        this.f24760a = z10;
        this.f24761b = yz0Var;
        this.f24762c = qz0Var;
        this.d = f7;
    }

    public static qz0 a(b01 b01Var, boolean z10) {
        qz0 qz0Var = b01Var.f24762c;
        if (qz0Var != e01.R) {
            return qz0Var;
        }
        if (b01Var.d == 0.0f) {
            if (z10) {
                return e01.S;
            }
            return e01.T;
        }
        return e01.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b01.class != obj.getClass()) {
            return false;
        }
        b01 b01Var = (b01) obj;
        if (this.f24762c.equals(b01Var.f24762c) && this.f24761b.equals(b01Var.f24761b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24762c.hashCode() + (this.f24761b.hashCode() * 31);
    }
}
