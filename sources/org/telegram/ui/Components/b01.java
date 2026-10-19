package org.telegram.ui.Components;
public final class b01 {
    public static final b01 e = new b01(false, new yz0(Integer.MIN_VALUE, -2147483647), e01.R, 0.0f);
    public final boolean f24758a;
    public final yz0 f24759b;
    public final qz0 f24760c;
    public final float d;

    public b01(boolean z10, yz0 yz0Var, qz0 qz0Var, float f7) {
        this.f24758a = z10;
        this.f24759b = yz0Var;
        this.f24760c = qz0Var;
        this.d = f7;
    }

    public static qz0 a(b01 b01Var, boolean z10) {
        qz0 qz0Var = b01Var.f24760c;
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
        if (this.f24760c.equals(b01Var.f24760c) && this.f24759b.equals(b01Var.f24759b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24760c.hashCode() + (this.f24759b.hashCode() * 31);
    }
}
