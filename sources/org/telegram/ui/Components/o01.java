package org.telegram.ui.Components;
public final class o01 {
    public static final o01 f29012e = new o01(false, new l01(Integer.MIN_VALUE, -2147483647), r01.R, 0.0f);
    public final boolean f29013a;
    public final l01 f29014b;
    public final d01 f29015c;
    public final float d;

    public o01(boolean z10, l01 l01Var, d01 d01Var, float f7) {
        this.f29013a = z10;
        this.f29014b = l01Var;
        this.f29015c = d01Var;
        this.d = f7;
    }

    public static d01 a(o01 o01Var, boolean z10) {
        d01 d01Var = o01Var.f29015c;
        if (d01Var != r01.R) {
            return d01Var;
        }
        if (o01Var.d == 0.0f) {
            if (z10) {
                return r01.S;
            }
            return r01.T;
        }
        return r01.U;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o01.class != obj.getClass()) {
            return false;
        }
        o01 o01Var = (o01) obj;
        if (this.f29015c.equals(o01Var.f29015c) && this.f29014b.equals(o01Var.f29014b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f29015c.hashCode() + (this.f29014b.hashCode() * 31);
    }
}
