package org.telegram.ui.Components;
public final class mx0 {
    public static final mx0 f37400e = new mx0(false, new jx0(Integer.MIN_VALUE, -2147483647), px0.T, 0.0f);
    public final boolean f37401a;
    public final jx0 f37402b;
    public final bx0 f37403c;
    public final float d;

    public mx0(boolean z10, jx0 jx0Var, bx0 bx0Var, float f10) {
        this.f37401a = z10;
        this.f37402b = jx0Var;
        this.f37403c = bx0Var;
        this.d = f10;
    }

    public static bx0 a(mx0 mx0Var, boolean z10) {
        bx0 bx0Var = mx0Var.f37403c;
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
        if (this.f37403c.equals(mx0Var.f37403c) && this.f37402b.equals(mx0Var.f37402b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f37403c.hashCode() + (this.f37402b.hashCode() * 31);
    }
}
