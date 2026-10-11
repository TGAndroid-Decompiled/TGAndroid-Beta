package org.telegram.ui.Components;
public final class j01 {
    public static final j01 f27547e = new j01(false, new g01(Integer.MIN_VALUE, -2147483647), m01.R, 0.0f);
    public final boolean f27548a;
    public final g01 f27549b;
    public final yz0 f27550c;
    public final float d;

    public j01(boolean z10, g01 g01Var, yz0 yz0Var, float f7) {
        this.f27548a = z10;
        this.f27549b = g01Var;
        this.f27550c = yz0Var;
        this.d = f7;
    }

    public static yz0 a(j01 j01Var, boolean z10) {
        yz0 yz0Var = j01Var.f27550c;
        if (yz0Var != m01.R) {
            return yz0Var;
        }
        if (j01Var.d == 0.0f) {
            if (z10) {
                return m01.S;
            }
            return m01.T;
        }
        return m01.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j01.class != obj.getClass()) {
            return false;
        }
        j01 j01Var = (j01) obj;
        if (this.f27550c.equals(j01Var.f27550c) && this.f27549b.equals(j01Var.f27549b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f27550c.hashCode() + (this.f27549b.hashCode() * 31);
    }
}
