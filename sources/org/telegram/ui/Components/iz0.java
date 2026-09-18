package org.telegram.ui.Components;
public final class iz0 {
    public static final iz0 e = new iz0(false, new fz0(Integer.MIN_VALUE, -2147483647), lz0.R, 0.0f);
    public final boolean f25062a;
    public final fz0 f25063b;
    public final xy0 f25064c;
    public final float d;

    public iz0(boolean z10, fz0 fz0Var, xy0 xy0Var, float f7) {
        this.f25062a = z10;
        this.f25063b = fz0Var;
        this.f25064c = xy0Var;
        this.d = f7;
    }

    public static xy0 a(iz0 iz0Var, boolean z10) {
        xy0 xy0Var = iz0Var.f25064c;
        if (xy0Var != lz0.R) {
            return xy0Var;
        }
        if (iz0Var.d == 0.0f) {
            if (z10) {
                return lz0.S;
            }
            return lz0.T;
        }
        return lz0.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iz0.class != obj.getClass()) {
            return false;
        }
        iz0 iz0Var = (iz0) obj;
        if (this.f25064c.equals(iz0Var.f25064c) && this.f25063b.equals(iz0Var.f25063b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f25064c.hashCode() + (this.f25063b.hashCode() * 31);
    }
}
