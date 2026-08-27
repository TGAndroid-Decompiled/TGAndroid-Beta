package org.telegram.ui.Components;

public final class qy0 {

    public static final qy0 f32004e = new qy0(false, new ny0(Integer.MIN_VALUE, -2147483647), ty0.N, 0.0f);

    public final boolean f32005a;

    public final ny0 f32006b;

    public final fy0 f32007c;
    public final float d;

    public qy0(boolean z10, ny0 ny0Var, fy0 fy0Var, float f10) {
        this.f32005a = z10;
        this.f32006b = ny0Var;
        this.f32007c = fy0Var;
        this.d = f10;
    }

    public static fy0 a(qy0 qy0Var, boolean z10) {
        fy0 fy0Var = qy0Var.f32007c;
        if (fy0Var != ty0.N) {
            return fy0Var;
        }
        if (qy0Var.d == 0.0f) {
            return z10 ? ty0.O : ty0.P;
        }
        return ty0.Q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qy0.class != obj.getClass()) {
            return false;
        }
        qy0 qy0Var = (qy0) obj;
        return this.f32007c.equals(qy0Var.f32007c) && this.f32006b.equals(qy0Var.f32006b);
    }

    public final int hashCode() {
        return this.f32007c.hashCode() + (this.f32006b.hashCode() * 31);
    }
}
