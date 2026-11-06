package org.telegram.ui.Components;
public final class jx0 {
    public static final jx0 f35101e = new jx0(false, new gx0(Integer.MIN_VALUE, -2147483647), mx0.S, 0.0f);
    public final boolean f35102a;
    public final gx0 f35103b;
    public final yw0 f35104c;
    public final float d;

    public jx0(boolean z9, gx0 gx0Var, yw0 yw0Var, float f10) {
        this.f35102a = z9;
        this.f35103b = gx0Var;
        this.f35104c = yw0Var;
        this.d = f10;
    }

    public static yw0 a(jx0 jx0Var, boolean z9) {
        yw0 yw0Var = jx0Var.f35104c;
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
        if (this.f35104c.equals(jx0Var.f35104c) && this.f35103b.equals(jx0Var.f35103b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f35104c.hashCode() + (this.f35103b.hashCode() * 31);
    }
}
