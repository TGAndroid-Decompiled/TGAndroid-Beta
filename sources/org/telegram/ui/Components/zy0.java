package org.telegram.ui.Components;
public final class zy0 {
    public static final zy0 f35454e = new zy0(false, new wy0(Integer.MIN_VALUE, -2147483647), cz0.N, 0.0f);
    public final boolean f35455a;
    public final wy0 f35456b;
    public final oy0 f35457c;
    public final float d;

    public zy0(boolean z10, wy0 wy0Var, oy0 oy0Var, float f9) {
        this.f35455a = z10;
        this.f35456b = wy0Var;
        this.f35457c = oy0Var;
        this.d = f9;
    }

    public static oy0 a(zy0 zy0Var, boolean z10) {
        oy0 oy0Var = zy0Var.f35457c;
        if (oy0Var != cz0.N) {
            return oy0Var;
        }
        if (zy0Var.d == 0.0f) {
            if (z10) {
                return cz0.O;
            }
            return cz0.P;
        }
        return cz0.Q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zy0.class != obj.getClass()) {
            return false;
        }
        zy0 zy0Var = (zy0) obj;
        if (this.f35457c.equals(zy0Var.f35457c) && this.f35456b.equals(zy0Var.f35456b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f35457c.hashCode() + (this.f35456b.hashCode() * 31);
    }
}
