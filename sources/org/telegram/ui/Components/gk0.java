package org.telegram.ui.Components;
public final class gk0 extends ng.a {
    public final yg.p0 f23370c;

    public gk0(int i10, yg.p0 p0Var) {
        super(i10, false);
        this.f23370c = p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gk0.class == obj.getClass()) {
            gk0 gk0Var = (gk0) obj;
            int i10 = this.f14046a;
            int i11 = gk0Var.f14046a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                yg.p0 p0Var = this.f23370c;
                if (p0Var != null && p0Var.equals(gk0Var.f23370c)) {
                    return true;
                }
                return false;
            } else if (i10 == i11) {
                return true;
            }
        }
        return false;
    }
}
