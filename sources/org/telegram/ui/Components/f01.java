package org.telegram.ui.Components;
public final class f01 {
    public static final f01 e = new f01(false, new c01(Integer.MIN_VALUE, -2147483647), i01.R, 0.0f);
    public final boolean f26118a;
    public final c01 f26119b;
    public final uz0 f26120c;
    public final float d;

    public f01(boolean z10, c01 c01Var, uz0 uz0Var, float f7) {
        this.f26118a = z10;
        this.f26119b = c01Var;
        this.f26120c = uz0Var;
        this.d = f7;
    }

    public static uz0 a(f01 f01Var, boolean z10) {
        uz0 uz0Var = f01Var.f26120c;
        if (uz0Var != i01.R) {
            return uz0Var;
        }
        if (f01Var.d == 0.0f) {
            if (z10) {
                return i01.S;
            }
            return i01.T;
        }
        return i01.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f01.class != obj.getClass()) {
            return false;
        }
        f01 f01Var = (f01) obj;
        if (this.f26120c.equals(f01Var.f26120c) && this.f26119b.equals(f01Var.f26119b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f26120c.hashCode() + (this.f26119b.hashCode() * 31);
    }
}
