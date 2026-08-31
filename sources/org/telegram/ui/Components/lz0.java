package org.telegram.ui.Components;
public final class lz0 {
    public static final lz0 f28865e = new lz0(false, new iz0(Integer.MIN_VALUE, -2147483647), oz0.O, 0.0f);
    public final boolean f28866a;
    public final iz0 f28867b;
    public final az0 f28868c;
    public final float d;

    public lz0(boolean z4, iz0 iz0Var, az0 az0Var, float f10) {
        this.f28866a = z4;
        this.f28867b = iz0Var;
        this.f28868c = az0Var;
        this.d = f10;
    }

    public static az0 a(lz0 lz0Var, boolean z4) {
        az0 az0Var = lz0Var.f28868c;
        if (az0Var != oz0.O) {
            return az0Var;
        }
        if (lz0Var.d == 0.0f) {
            if (z4) {
                return oz0.P;
            }
            return oz0.Q;
        }
        return oz0.R;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lz0.class != obj.getClass()) {
            return false;
        }
        lz0 lz0Var = (lz0) obj;
        if (this.f28868c.equals(lz0Var.f28868c) && this.f28867b.equals(lz0Var.f28867b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28868c.hashCode() + (this.f28867b.hashCode() * 31);
    }
}
