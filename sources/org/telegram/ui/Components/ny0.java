package org.telegram.ui.Components;
public final class ny0 {
    public static final ny0 e = new ny0(false, new ky0(Integer.MIN_VALUE, -2147483647), qy0.R, 0.0f);
    public final boolean f28986a;
    public final ky0 f28987b;
    public final cy0 f28988c;
    public final float d;

    public ny0(boolean z10, ky0 ky0Var, cy0 cy0Var, float f7) {
        this.f28986a = z10;
        this.f28987b = ky0Var;
        this.f28988c = cy0Var;
        this.d = f7;
    }

    public static cy0 a(ny0 ny0Var, boolean z10) {
        cy0 cy0Var = ny0Var.f28988c;
        if (cy0Var != qy0.R) {
            return cy0Var;
        }
        if (ny0Var.d == 0.0f) {
            if (z10) {
                return qy0.S;
            }
            return qy0.T;
        }
        return qy0.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ny0.class != obj.getClass()) {
            return false;
        }
        ny0 ny0Var = (ny0) obj;
        if (this.f28988c.equals(ny0Var.f28988c) && this.f28987b.equals(ny0Var.f28987b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28988c.hashCode() + (this.f28987b.hashCode() * 31);
    }
}
