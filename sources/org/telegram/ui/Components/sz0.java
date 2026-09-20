package org.telegram.ui.Components;
public final class sz0 {
    public static final sz0 e = new sz0(false, new pz0(Integer.MIN_VALUE, -2147483647), vz0.R, 0.0f);
    public final boolean f28237a;
    public final pz0 f28238b;
    public final hz0 f28239c;
    public final float d;

    public sz0(boolean z10, pz0 pz0Var, hz0 hz0Var, float f7) {
        this.f28237a = z10;
        this.f28238b = pz0Var;
        this.f28239c = hz0Var;
        this.d = f7;
    }

    public static hz0 a(sz0 sz0Var, boolean z10) {
        hz0 hz0Var = sz0Var.f28239c;
        if (hz0Var != vz0.R) {
            return hz0Var;
        }
        if (sz0Var.d == 0.0f) {
            if (z10) {
                return vz0.S;
            }
            return vz0.T;
        }
        return vz0.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sz0.class != obj.getClass()) {
            return false;
        }
        sz0 sz0Var = (sz0) obj;
        if (this.f28239c.equals(sz0Var.f28239c) && this.f28238b.equals(sz0Var.f28238b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28239c.hashCode() + (this.f28238b.hashCode() * 31);
    }
}
