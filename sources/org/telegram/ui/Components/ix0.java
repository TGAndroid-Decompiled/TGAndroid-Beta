package org.telegram.ui.Components;
public final class ix0 {
    public static final ix0 f34854e = new ix0(false, new fx0(Integer.MIN_VALUE, -2147483647), lx0.S, 0.0f);
    public final boolean f34855a;
    public final fx0 f34856b;
    public final xw0 f34857c;
    public final float d;

    public ix0(boolean z10, fx0 fx0Var, xw0 xw0Var, float f10) {
        this.f34855a = z10;
        this.f34856b = fx0Var;
        this.f34857c = xw0Var;
        this.d = f10;
    }

    public static xw0 a(ix0 ix0Var, boolean z10) {
        xw0 xw0Var = ix0Var.f34857c;
        if (xw0Var != lx0.S) {
            return xw0Var;
        }
        if (ix0Var.d == 0.0f) {
            if (z10) {
                return lx0.T;
            }
            return lx0.U;
        }
        return lx0.V;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ix0.class != obj.getClass()) {
            return false;
        }
        ix0 ix0Var = (ix0) obj;
        if (this.f34857c.equals(ix0Var.f34857c) && this.f34856b.equals(ix0Var.f34856b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f34857c.hashCode() + (this.f34856b.hashCode() * 31);
    }
}
