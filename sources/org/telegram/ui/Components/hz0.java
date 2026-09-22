package org.telegram.ui.Components;
public final class hz0 {
    public static final hz0 e = new hz0(false, new ez0(Integer.MIN_VALUE, -2147483647), kz0.R, 0.0f);
    public final boolean f24827a;
    public final ez0 f24828b;
    public final wy0 f24829c;
    public final float d;

    public hz0(boolean z10, ez0 ez0Var, wy0 wy0Var, float f7) {
        this.f24827a = z10;
        this.f24828b = ez0Var;
        this.f24829c = wy0Var;
        this.d = f7;
    }

    public static wy0 a(hz0 hz0Var, boolean z10) {
        wy0 wy0Var = hz0Var.f24829c;
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
        if (this.f24829c.equals(hz0Var.f24829c) && this.f24828b.equals(hz0Var.f24828b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24829c.hashCode() + (this.f24828b.hashCode() * 31);
    }
}
