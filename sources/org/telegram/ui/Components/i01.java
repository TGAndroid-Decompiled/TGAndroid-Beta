package org.telegram.ui.Components;
public final class i01 {
    public static final i01 f27175e = new i01(false, new f01(Integer.MIN_VALUE, -2147483647), l01.R, 0.0f);
    public final boolean f27176a;
    public final f01 f27177b;
    public final xz0 f27178c;
    public final float d;

    public i01(boolean z10, f01 f01Var, xz0 xz0Var, float f7) {
        this.f27176a = z10;
        this.f27177b = f01Var;
        this.f27178c = xz0Var;
        this.d = f7;
    }

    public static xz0 a(i01 i01Var, boolean z10) {
        xz0 xz0Var = i01Var.f27178c;
        if (xz0Var != l01.R) {
            return xz0Var;
        }
        if (i01Var.d == 0.0f) {
            if (z10) {
                return l01.S;
            }
            return l01.T;
        }
        return l01.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i01.class != obj.getClass()) {
            return false;
        }
        i01 i01Var = (i01) obj;
        if (this.f27178c.equals(i01Var.f27178c) && this.f27177b.equals(i01Var.f27177b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f27178c.hashCode() + (this.f27177b.hashCode() * 31);
    }
}
