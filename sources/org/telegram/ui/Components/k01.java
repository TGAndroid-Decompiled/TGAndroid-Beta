package org.telegram.ui.Components;
public final class k01 {
    public static final k01 f27797e = new k01(false, new h01(Integer.MIN_VALUE, -2147483647), n01.R, 0.0f);
    public final boolean f27798a;
    public final h01 f27799b;
    public final zz0 f27800c;
    public final float d;

    public k01(boolean z10, h01 h01Var, zz0 zz0Var, float f7) {
        this.f27798a = z10;
        this.f27799b = h01Var;
        this.f27800c = zz0Var;
        this.d = f7;
    }

    public static zz0 a(k01 k01Var, boolean z10) {
        zz0 zz0Var = k01Var.f27800c;
        if (zz0Var != n01.R) {
            return zz0Var;
        }
        if (k01Var.d == 0.0f) {
            if (z10) {
                return n01.S;
            }
            return n01.T;
        }
        return n01.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k01.class != obj.getClass()) {
            return false;
        }
        k01 k01Var = (k01) obj;
        if (this.f27800c.equals(k01Var.f27800c) && this.f27799b.equals(k01Var.f27799b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f27800c.hashCode() + (this.f27799b.hashCode() * 31);
    }
}
