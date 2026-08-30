package org.telegram.ui.Components;
public final class kz0 {
    public static final kz0 e = new kz0(false, new hz0(Integer.MIN_VALUE, -2147483647), nz0.O, 0.0f);
    public final boolean f26494a;
    public final hz0 f26495b;
    public final zy0 f26496c;
    public final float d;

    public kz0(boolean z4, hz0 hz0Var, zy0 zy0Var, float f10) {
        this.f26494a = z4;
        this.f26495b = hz0Var;
        this.f26496c = zy0Var;
        this.d = f10;
    }

    public static zy0 a(kz0 kz0Var, boolean z4) {
        zy0 zy0Var = kz0Var.f26496c;
        if (zy0Var != nz0.O) {
            return zy0Var;
        }
        if (kz0Var.d == 0.0f) {
            if (z4) {
                return nz0.P;
            }
            return nz0.Q;
        }
        return nz0.R;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kz0.class != obj.getClass()) {
            return false;
        }
        kz0 kz0Var = (kz0) obj;
        if (this.f26496c.equals(kz0Var.f26496c) && this.f26495b.equals(kz0Var.f26495b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f26496c.hashCode() + (this.f26495b.hashCode() * 31);
    }
}
