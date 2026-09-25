package org.telegram.ui.Components;
public final class rz0 {
    public static final rz0 e = new rz0(false, new oz0(Integer.MIN_VALUE, -2147483647), uz0.R, 0.0f);
    public final boolean f28078a;
    public final oz0 f28079b;
    public final gz0 f28080c;
    public final float d;

    public rz0(boolean z10, oz0 oz0Var, gz0 gz0Var, float f7) {
        this.f28078a = z10;
        this.f28079b = oz0Var;
        this.f28080c = gz0Var;
        this.d = f7;
    }

    public static gz0 a(rz0 rz0Var, boolean z10) {
        gz0 gz0Var = rz0Var.f28080c;
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
        if (this.f28080c.equals(rz0Var.f28080c) && this.f28079b.equals(rz0Var.f28079b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28080c.hashCode() + (this.f28079b.hashCode() * 31);
    }
}
