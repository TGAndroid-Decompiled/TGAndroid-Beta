package org.telegram.ui.Components;
public final class tx0 {
    public static final tx0 f40130e = new tx0(false, new qx0(Integer.MIN_VALUE, -2147483647), wx0.T, 0.0f);
    public final boolean f40131a;
    public final qx0 f40132b;
    public final ix0 f40133c;
    public final float d;

    public tx0(boolean z10, qx0 qx0Var, ix0 ix0Var, float f10) {
        this.f40131a = z10;
        this.f40132b = qx0Var;
        this.f40133c = ix0Var;
        this.d = f10;
    }

    public static ix0 a(tx0 tx0Var, boolean z10) {
        ix0 ix0Var = tx0Var.f40133c;
        if (ix0Var != wx0.T) {
            return ix0Var;
        }
        if (tx0Var.d == 0.0f) {
            if (z10) {
                return wx0.U;
            }
            return wx0.V;
        }
        return wx0.W;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tx0.class != obj.getClass()) {
            return false;
        }
        tx0 tx0Var = (tx0) obj;
        if (this.f40133c.equals(tx0Var.f40133c) && this.f40132b.equals(tx0Var.f40132b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40133c.hashCode() + (this.f40132b.hashCode() * 31);
    }
}
