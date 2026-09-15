package org.telegram.ui.Components;
public final class hz0 {
    public static final hz0 e = new hz0(false, new ez0(Integer.MIN_VALUE, -2147483647), kz0.R, 0.0f);
    public final boolean f24821a;
    public final ez0 f24822b;
    public final wy0 f24823c;
    public final float d;

    public hz0(boolean z10, ez0 ez0Var, wy0 wy0Var, float f7) {
        this.f24821a = z10;
        this.f24822b = ez0Var;
        this.f24823c = wy0Var;
        this.d = f7;
    }

    public static wy0 a(hz0 hz0Var, boolean z10) {
        wy0 wy0Var = hz0Var.f24823c;
        if (wy0Var != kz0.R) {
            return wy0Var;
        }
        if (hz0Var.d == 0.0f) {
            if (z10) {
                return kz0.S;
            }
            return kz0.T;
        }
        return kz0.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hz0.class != obj.getClass()) {
            return false;
        }
        hz0 hz0Var = (hz0) obj;
        if (this.f24823c.equals(hz0Var.f24823c) && this.f24822b.equals(hz0Var.f24822b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24823c.hashCode() + (this.f24822b.hashCode() * 31);
    }
}
