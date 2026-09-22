package org.telegram.ui.Components;
public final class uz0 {
    public static final uz0 e = new uz0(false, new rz0(Integer.MIN_VALUE, -2147483647), xz0.R, 0.0f);
    public final boolean f28921a;
    public final rz0 f28922b;
    public final jz0 f28923c;
    public final float d;

    public uz0(boolean z10, rz0 rz0Var, jz0 jz0Var, float f7) {
        this.f28921a = z10;
        this.f28922b = rz0Var;
        this.f28923c = jz0Var;
        this.d = f7;
    }

    public static jz0 a(uz0 uz0Var, boolean z10) {
        jz0 jz0Var = uz0Var.f28923c;
        if (jz0Var != xz0.R) {
            return jz0Var;
        }
        if (uz0Var.d == 0.0f) {
            if (z10) {
                return xz0.S;
            }
            return xz0.T;
        }
        return xz0.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uz0.class != obj.getClass()) {
            return false;
        }
        uz0 uz0Var = (uz0) obj;
        if (this.f28923c.equals(uz0Var.f28923c) && this.f28922b.equals(uz0Var.f28922b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28923c.hashCode() + (this.f28922b.hashCode() * 31);
    }
}
