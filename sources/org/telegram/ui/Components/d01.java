package org.telegram.ui.Components;
public final class d01 {
    public static final d01 f25568e = new d01(false, new a01(Integer.MIN_VALUE, -2147483647), g01.R, 0.0f);
    public final boolean f25569a;
    public final a01 f25570b;
    public final sz0 f25571c;
    public final float d;

    public d01(boolean z10, a01 a01Var, sz0 sz0Var, float f7) {
        this.f25569a = z10;
        this.f25570b = a01Var;
        this.f25571c = sz0Var;
        this.d = f7;
    }

    public static sz0 a(d01 d01Var, boolean z10) {
        sz0 sz0Var = d01Var.f25571c;
        if (sz0Var != g01.R) {
            return sz0Var;
        }
        if (d01Var.d == 0.0f) {
            if (z10) {
                return g01.S;
            }
            return g01.T;
        }
        return g01.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d01.class != obj.getClass()) {
            return false;
        }
        d01 d01Var = (d01) obj;
        if (this.f25571c.equals(d01Var.f25571c) && this.f25570b.equals(d01Var.f25570b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f25571c.hashCode() + (this.f25570b.hashCode() * 31);
    }
}
