package org.telegram.ui.Components;
public final class mx0 {
    public static final mx0 f37401e = new mx0(false, new jx0(Integer.MIN_VALUE, -2147483647), px0.T, 0.0f);
    public final boolean f37402a;
    public final jx0 f37403b;
    public final bx0 f37404c;
    public final float d;

    public mx0(boolean z10, jx0 jx0Var, bx0 bx0Var, float f10) {
        this.f37402a = z10;
        this.f37403b = jx0Var;
        this.f37404c = bx0Var;
        this.d = f10;
    }

    public static bx0 a(mx0 mx0Var, boolean z10) {
        bx0 bx0Var = mx0Var.f37404c;
        if (bx0Var != px0.T) {
            return bx0Var;
        }
        if (mx0Var.d == 0.0f) {
            if (z10) {
                return px0.U;
            }
            return px0.V;
        }
        return px0.W;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mx0.class != obj.getClass()) {
            return false;
        }
        mx0 mx0Var = (mx0) obj;
        if (this.f37404c.equals(mx0Var.f37404c) && this.f37403b.equals(mx0Var.f37403b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f37404c.hashCode() + (this.f37403b.hashCode() * 31);
    }
}
