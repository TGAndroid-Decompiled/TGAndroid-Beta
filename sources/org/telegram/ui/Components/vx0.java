package org.telegram.ui.Components;
public final class vx0 {
    public static final vx0 f41557e = new vx0(false, new sx0(Integer.MIN_VALUE, -2147483647), yx0.T, 0.0f);
    public final boolean f41558a;
    public final sx0 f41559b;
    public final kx0 f41560c;
    public final float d;

    public vx0(boolean z10, sx0 sx0Var, kx0 kx0Var, float f10) {
        this.f41558a = z10;
        this.f41559b = sx0Var;
        this.f41560c = kx0Var;
        this.d = f10;
    }

    public static kx0 a(vx0 vx0Var, boolean z10) {
        kx0 kx0Var = vx0Var.f41560c;
        if (kx0Var != yx0.T) {
            return kx0Var;
        }
        if (vx0Var.d == 0.0f) {
            if (z10) {
                return yx0.U;
            }
            return yx0.V;
        }
        return yx0.W;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vx0.class != obj.getClass()) {
            return false;
        }
        vx0 vx0Var = (vx0) obj;
        if (this.f41560c.equals(vx0Var.f41560c) && this.f41559b.equals(vx0Var.f41559b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f41560c.hashCode() + (this.f41559b.hashCode() * 31);
    }
}
