package org.telegram.ui.Components;
public final class gz0 {
    public static final gz0 f26565e = new gz0(false, new dz0(Integer.MIN_VALUE, -2147483647), jz0.R, 0.0f);
    public final boolean f26566a;
    public final dz0 f26567b;
    public final vy0 f26568c;
    public final float d;

    public gz0(boolean z10, dz0 dz0Var, vy0 vy0Var, float f7) {
        this.f26566a = z10;
        this.f26567b = dz0Var;
        this.f26568c = vy0Var;
        this.d = f7;
    }

    public static vy0 a(gz0 gz0Var, boolean z10) {
        vy0 vy0Var = gz0Var.f26568c;
        if (vy0Var != jz0.R) {
            return vy0Var;
        }
        if (gz0Var.d == 0.0f) {
            if (z10) {
                return jz0.S;
            }
            return jz0.T;
        }
        return jz0.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gz0.class != obj.getClass()) {
            return false;
        }
        gz0 gz0Var = (gz0) obj;
        if (this.f26568c.equals(gz0Var.f26568c) && this.f26567b.equals(gz0Var.f26567b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f26568c.hashCode() + (this.f26567b.hashCode() * 31);
    }
}
