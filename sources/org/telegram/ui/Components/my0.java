package org.telegram.ui.Components;
public final class my0 {
    public static final my0 e = new my0(false, new jy0(Integer.MIN_VALUE, -2147483647), py0.R, 0.0f);
    public final boolean f28634a;
    public final jy0 f28635b;
    public final by0 f28636c;
    public final float d;

    public my0(boolean z10, jy0 jy0Var, by0 by0Var, float f7) {
        this.f28634a = z10;
        this.f28635b = jy0Var;
        this.f28636c = by0Var;
        this.d = f7;
    }

    public static by0 a(my0 my0Var, boolean z10) {
        by0 by0Var = my0Var.f28636c;
        if (by0Var != py0.R) {
            return by0Var;
        }
        if (my0Var.d == 0.0f) {
            if (z10) {
                return py0.S;
            }
            return py0.T;
        }
        return py0.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || my0.class != obj.getClass()) {
            return false;
        }
        my0 my0Var = (my0) obj;
        if (this.f28636c.equals(my0Var.f28636c) && this.f28635b.equals(my0Var.f28635b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28636c.hashCode() + (this.f28635b.hashCode() * 31);
    }
}
