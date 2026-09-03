package org.telegram.ui.Components;
public final class gk0 extends bg.b {
    public final mg.q0 f25192c;

    public gk0(int i10, mg.q0 q0Var) {
        super(i10, false);
        this.f25192c = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gk0.class == obj.getClass()) {
            gk0 gk0Var = (gk0) obj;
            int i10 = this.f1830a;
            int i11 = gk0Var.f1830a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                mg.q0 q0Var = this.f25192c;
                if (q0Var != null && q0Var.equals(gk0Var.f25192c)) {
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
