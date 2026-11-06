package org.telegram.ui.Components;
public final class ix0 {
    public static final ix0 f34779e = new ix0(false, new fx0(Integer.MIN_VALUE, -2147483647), lx0.R, 0.0f);
    public final boolean f34780a;
    public final fx0 f34781b;
    public final xw0 f34782c;
    public final float d;

    public ix0(boolean z9, fx0 fx0Var, xw0 xw0Var, float f10) {
        this.f34780a = z9;
        this.f34781b = fx0Var;
        this.f34782c = xw0Var;
        this.d = f10;
    }

    public static xw0 a(ix0 ix0Var, boolean z9) {
        xw0 xw0Var = ix0Var.f34782c;
        if (xw0Var != lx0.R) {
            return xw0Var;
        }
        if (ix0Var.d == 0.0f) {
            if (z9) {
                return lx0.S;
            }
            return lx0.T;
        }
        return lx0.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ix0.class != obj.getClass()) {
            return false;
        }
        ix0 ix0Var = (ix0) obj;
        if (this.f34782c.equals(ix0Var.f34782c) && this.f34781b.equals(ix0Var.f34781b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f34782c.hashCode() + (this.f34781b.hashCode() * 31);
    }
}
