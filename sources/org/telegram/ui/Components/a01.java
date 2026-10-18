package org.telegram.ui.Components;
public final class a01 {
    public static final a01 e = new a01(false, new xz0(Integer.MIN_VALUE, -2147483647), d01.R, 0.0f);
    public final boolean f24433a;
    public final xz0 f24434b;
    public final pz0 f24435c;
    public final float d;

    public a01(boolean z10, xz0 xz0Var, pz0 pz0Var, float f7) {
        this.f24433a = z10;
        this.f24434b = xz0Var;
        this.f24435c = pz0Var;
        this.d = f7;
    }

    public static pz0 a(a01 a01Var, boolean z10) {
        pz0 pz0Var = a01Var.f24435c;
        if (pz0Var != d01.R) {
            return pz0Var;
        }
        if (a01Var.d == 0.0f) {
            if (z10) {
                return d01.S;
            }
            return d01.T;
        }
        return d01.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a01.class != obj.getClass()) {
            return false;
        }
        a01 a01Var = (a01) obj;
        if (this.f24435c.equals(a01Var.f24435c) && this.f24434b.equals(a01Var.f24434b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24435c.hashCode() + (this.f24434b.hashCode() * 31);
    }
}
