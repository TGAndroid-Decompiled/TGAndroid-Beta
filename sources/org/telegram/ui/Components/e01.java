package org.telegram.ui.Components;
public final class e01 {
    public static final e01 e = new e01(false, new b01(Integer.MIN_VALUE, -2147483647), h01.R, 0.0f);
    public final boolean f24546a;
    public final b01 f24547b;
    public final tz0 f24548c;
    public final float d;

    public e01(boolean z10, b01 b01Var, tz0 tz0Var, float f7) {
        this.f24546a = z10;
        this.f24547b = b01Var;
        this.f24548c = tz0Var;
        this.d = f7;
    }

    public static tz0 a(e01 e01Var, boolean z10) {
        tz0 tz0Var = e01Var.f24548c;
        if (tz0Var != h01.R) {
            return tz0Var;
        }
        if (e01Var.d == 0.0f) {
            if (z10) {
                return h01.S;
            }
            return h01.T;
        }
        return h01.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e01.class != obj.getClass()) {
            return false;
        }
        e01 e01Var = (e01) obj;
        if (this.f24548c.equals(e01Var.f24548c) && this.f24547b.equals(e01Var.f24547b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24548c.hashCode() + (this.f24547b.hashCode() * 31);
    }
}
