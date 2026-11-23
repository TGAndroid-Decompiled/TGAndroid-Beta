package org.telegram.ui.Components;
public final class ux0 {
    public static final ux0 f40500e = new ux0(false, new rx0(Integer.MIN_VALUE, -2147483647), xx0.T, 0.0f);
    public final boolean f40501a;
    public final rx0 f40502b;
    public final jx0 f40503c;
    public final float d;

    public ux0(boolean z10, rx0 rx0Var, jx0 jx0Var, float f10) {
        this.f40501a = z10;
        this.f40502b = rx0Var;
        this.f40503c = jx0Var;
        this.d = f10;
    }

    public static jx0 a(ux0 ux0Var, boolean z10) {
        jx0 jx0Var = ux0Var.f40503c;
        if (jx0Var != xx0.T) {
            return jx0Var;
        }
        if (ux0Var.d == 0.0f) {
            if (z10) {
                return xx0.U;
            }
            return xx0.V;
        }
        return xx0.W;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ux0.class != obj.getClass()) {
            return false;
        }
        ux0 ux0Var = (ux0) obj;
        if (this.f40503c.equals(ux0Var.f40503c) && this.f40502b.equals(ux0Var.f40502b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40503c.hashCode() + (this.f40502b.hashCode() * 31);
    }
}
