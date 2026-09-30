package org.telegram.ui.Components;
public final class tz0 {
    public static final tz0 e = new tz0(false, new qz0(Integer.MIN_VALUE, -2147483647), wz0.R, 0.0f);
    public final boolean f28657a;
    public final qz0 f28658b;
    public final iz0 f28659c;
    public final float d;

    public tz0(boolean z10, qz0 qz0Var, iz0 iz0Var, float f7) {
        this.f28657a = z10;
        this.f28658b = qz0Var;
        this.f28659c = iz0Var;
        this.d = f7;
    }

    public static iz0 a(tz0 tz0Var, boolean z10) {
        iz0 iz0Var = tz0Var.f28659c;
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
        if (this.f28659c.equals(tz0Var.f28659c) && this.f28658b.equals(tz0Var.f28658b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28659c.hashCode() + (this.f28658b.hashCode() * 31);
    }
}
