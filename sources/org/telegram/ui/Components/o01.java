package org.telegram.ui.Components;
public final class o01 {
    public static final o01 e = new o01(false, new l01(Integer.MIN_VALUE, -2147483647), r01.R, 0.0f);
    public final boolean f31119a;
    public final l01 f31120b;
    public final kb1 f31121c;
    public final float d;

    public o01(boolean z10, l01 l01Var, kb1 kb1Var, float f7) {
        this.f31119a = z10;
        this.f31120b = l01Var;
        this.f31121c = kb1Var;
        this.d = f7;
    }

    public static kb1 a(o01 o01Var, boolean z10) {
        kb1 kb1Var = o01Var.f31121c;
        if (kb1Var != r01.R) {
            return kb1Var;
        }
        if (o01Var.d == 0.0f) {
            if (z10) {
                return r01.S;
            }
            return r01.T;
        }
        return r01.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o01.class != obj.getClass()) {
            return false;
        }
        o01 o01Var = (o01) obj;
        if (this.f31121c.equals(o01Var.f31121c) && this.f31120b.equals(o01Var.f31120b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31121c.hashCode() + (this.f31120b.hashCode() * 31);
    }
}
