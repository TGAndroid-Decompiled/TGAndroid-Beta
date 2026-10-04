package org.telegram.ui.Components;
public final class c01 {
    public static final c01 f25153e = new c01(false, new zz0(Integer.MIN_VALUE, -2147483647), f01.R, 0.0f);
    public final boolean f25154a;
    public final zz0 f25155b;
    public final rz0 f25156c;
    public final float d;

    public c01(boolean z10, zz0 zz0Var, rz0 rz0Var, float f7) {
        this.f25154a = z10;
        this.f25155b = zz0Var;
        this.f25156c = rz0Var;
        this.d = f7;
    }

    public static rz0 a(c01 c01Var, boolean z10) {
        rz0 rz0Var = c01Var.f25156c;
        if (rz0Var != f01.R) {
            return rz0Var;
        }
        if (c01Var.d == 0.0f) {
            if (z10) {
                return f01.S;
            }
            return f01.T;
        }
        return f01.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c01.class != obj.getClass()) {
            return false;
        }
        c01 c01Var = (c01) obj;
        if (this.f25156c.equals(c01Var.f25156c) && this.f25155b.equals(c01Var.f25155b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f25156c.hashCode() + (this.f25155b.hashCode() * 31);
    }
}
