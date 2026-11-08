package org.telegram.ui.Components;
public final class jx0 {
    public static final jx0 f35126e = new jx0(false, new gx0(Integer.MIN_VALUE, -2147483647), mx0.S, 0.0f);
    public final boolean f35127a;
    public final gx0 f35128b;
    public final yw0 f35129c;
    public final float d;

    public jx0(boolean z9, gx0 gx0Var, yw0 yw0Var, float f10) {
        this.f35127a = z9;
        this.f35128b = gx0Var;
        this.f35129c = yw0Var;
        this.d = f10;
    }

    public static yw0 a(jx0 jx0Var, boolean z9) {
        yw0 yw0Var = jx0Var.f35129c;
        if (yw0Var != mx0.S) {
            return yw0Var;
        }
        if (jx0Var.d == 0.0f) {
            if (z9) {
                return mx0.T;
            }
            return mx0.U;
        }
        return mx0.V;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jx0.class != obj.getClass()) {
            return false;
        }
        jx0 jx0Var = (jx0) obj;
        if (this.f35129c.equals(jx0Var.f35129c) && this.f35128b.equals(jx0Var.f35128b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f35129c.hashCode() + (this.f35128b.hashCode() * 31);
    }
}
