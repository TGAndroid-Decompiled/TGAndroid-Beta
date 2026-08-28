package org.telegram.ui.Components;
public final class oy0 {
    public static final oy0 f31474e = new oy0(false, new ly0(Integer.MIN_VALUE, -2147483647), ry0.N, 0.0f);
    public final boolean f31475a;
    public final ly0 f31476b;
    public final dy0 f31477c;
    public final float d;

    public oy0(boolean z10, ly0 ly0Var, dy0 dy0Var, float f10) {
        this.f31475a = z10;
        this.f31476b = ly0Var;
        this.f31477c = dy0Var;
        this.d = f10;
    }

    public static dy0 a(oy0 oy0Var, boolean z10) {
        dy0 dy0Var = oy0Var.f31477c;
        if (dy0Var != ry0.N) {
            return dy0Var;
        }
        if (oy0Var.d == 0.0f) {
            if (z10) {
                return ry0.O;
            }
            return ry0.P;
        }
        return ry0.Q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oy0.class != obj.getClass()) {
            return false;
        }
        oy0 oy0Var = (oy0) obj;
        if (this.f31477c.equals(oy0Var.f31477c) && this.f31476b.equals(oy0Var.f31476b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31477c.hashCode() + (this.f31476b.hashCode() * 31);
    }
}
