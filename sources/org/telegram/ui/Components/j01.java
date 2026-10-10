package org.telegram.ui.Components;
public final class j01 {
    public static final j01 f27490e = new j01(false, new g01(Integer.MIN_VALUE, -2147483647), m01.R, 0.0f);
    public final boolean f27491a;
    public final g01 f27492b;
    public final yz0 f27493c;
    public final float d;

    public j01(boolean z10, g01 g01Var, yz0 yz0Var, float f7) {
        this.f27491a = z10;
        this.f27492b = g01Var;
        this.f27493c = yz0Var;
        this.d = f7;
    }

    public static yz0 a(j01 j01Var, boolean z10) {
        yz0 yz0Var = j01Var.f27493c;
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
        if (this.f27493c.equals(j01Var.f27493c) && this.f27492b.equals(j01Var.f27492b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f27493c.hashCode() + (this.f27492b.hashCode() * 31);
    }
}
