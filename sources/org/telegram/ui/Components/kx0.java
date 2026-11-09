package org.telegram.ui.Components;
public final class kx0 {
    public static final kx0 f35510e = new kx0(false, new hx0(Integer.MIN_VALUE, -2147483647), nx0.S, 0.0f);
    public final boolean f35511a;
    public final hx0 f35512b;
    public final zw0 f35513c;
    public final float d;

    public kx0(boolean z9, hx0 hx0Var, zw0 zw0Var, float f10) {
        this.f35511a = z9;
        this.f35512b = hx0Var;
        this.f35513c = zw0Var;
        this.d = f10;
    }

    public static zw0 a(kx0 kx0Var, boolean z9) {
        zw0 zw0Var = kx0Var.f35513c;
        if (zw0Var != nx0.S) {
            return zw0Var;
        }
        if (kx0Var.d == 0.0f) {
            if (z9) {
                return nx0.T;
            }
            return nx0.U;
        }
        return nx0.V;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kx0.class != obj.getClass()) {
            return false;
        }
        kx0 kx0Var = (kx0) obj;
        if (this.f35513c.equals(kx0Var.f35513c) && this.f35512b.equals(kx0Var.f35512b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f35513c.hashCode() + (this.f35512b.hashCode() * 31);
    }
}
