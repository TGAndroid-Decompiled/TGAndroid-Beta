package org.telegram.ui.Components;
public final class rz0 {
    public static final rz0 e = new rz0(false, new oz0(Integer.MIN_VALUE, -2147483647), uz0.R, 0.0f);
    public final boolean f28070a;
    public final oz0 f28071b;
    public final gz0 f28072c;
    public final float d;

    public rz0(boolean z10, oz0 oz0Var, gz0 gz0Var, float f7) {
        this.f28070a = z10;
        this.f28071b = oz0Var;
        this.f28072c = gz0Var;
        this.d = f7;
    }

    public static gz0 a(rz0 rz0Var, boolean z10) {
        gz0 gz0Var = rz0Var.f28072c;
        if (gz0Var != uz0.R) {
            return gz0Var;
        }
        if (rz0Var.d == 0.0f) {
            if (z10) {
                return uz0.S;
            }
            return uz0.T;
        }
        return uz0.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rz0.class != obj.getClass()) {
            return false;
        }
        rz0 rz0Var = (rz0) obj;
        if (this.f28072c.equals(rz0Var.f28072c) && this.f28071b.equals(rz0Var.f28071b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28072c.hashCode() + (this.f28071b.hashCode() * 31);
    }
}
