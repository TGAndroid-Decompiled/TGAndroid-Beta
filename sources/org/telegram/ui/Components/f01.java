package org.telegram.ui.Components;
public final class f01 {
    public static final f01 e = new f01(false, new c01(Integer.MIN_VALUE, -2147483647), i01.R, 0.0f);
    public final boolean f24537a;
    public final c01 f24538b;
    public final uz0 f24539c;
    public final float d;

    public f01(boolean z10, c01 c01Var, uz0 uz0Var, float f7) {
        this.f24537a = z10;
        this.f24538b = c01Var;
        this.f24539c = uz0Var;
        this.d = f7;
    }

    public static uz0 a(f01 f01Var, boolean z10) {
        uz0 uz0Var = f01Var.f24539c;
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
        if (this.f24539c.equals(f01Var.f24539c) && this.f24538b.equals(f01Var.f24538b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24539c.hashCode() + (this.f24538b.hashCode() * 31);
    }
}
