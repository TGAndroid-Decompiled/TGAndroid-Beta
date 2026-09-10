package org.telegram.ui.Components;
public final class tz0 {
    public static final tz0 e = new tz0(false, new qz0(Integer.MIN_VALUE, -2147483647), wz0.R, 0.0f);
    public final boolean f27525a;
    public final qz0 f27526b;
    public final iz0 f27527c;
    public final float d;

    public tz0(boolean z10, qz0 qz0Var, iz0 iz0Var, float f7) {
        this.f27525a = z10;
        this.f27526b = qz0Var;
        this.f27527c = iz0Var;
        this.d = f7;
    }

    public static iz0 a(tz0 tz0Var, boolean z10) {
        iz0 iz0Var = tz0Var.f27527c;
        if (iz0Var != wz0.R) {
            return iz0Var;
        }
        if (tz0Var.d == 0.0f) {
            if (z10) {
                return wz0.S;
            }
            return wz0.T;
        }
        return wz0.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tz0.class != obj.getClass()) {
            return false;
        }
        tz0 tz0Var = (tz0) obj;
        if (this.f27527c.equals(tz0Var.f27527c) && this.f27526b.equals(tz0Var.f27526b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f27527c.hashCode() + (this.f27526b.hashCode() * 31);
    }
}
