package org.telegram.ui.Components;
public final class n01 {
    public static final n01 e = new n01(false, new k01(Integer.MIN_VALUE, -2147483647), q01.R, 0.0f);
    public final boolean f30789a;
    public final k01 f30790b;
    public final gb1 f30791c;
    public final float d;

    public n01(boolean z10, k01 k01Var, gb1 gb1Var, float f7) {
        this.f30789a = z10;
        this.f30790b = k01Var;
        this.f30791c = gb1Var;
        this.d = f7;
    }

    public static gb1 a(n01 n01Var, boolean z10) {
        gb1 gb1Var = n01Var.f30791c;
        if (gb1Var != q01.R) {
            return gb1Var;
        }
        if (n01Var.d == 0.0f) {
            if (z10) {
                return q01.S;
            }
            return q01.T;
        }
        return q01.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n01.class != obj.getClass()) {
            return false;
        }
        n01 n01Var = (n01) obj;
        if (this.f30791c.equals(n01Var.f30791c) && this.f30790b.equals(n01Var.f30790b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f30791c.hashCode() + (this.f30790b.hashCode() * 31);
    }
}
