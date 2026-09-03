package org.telegram.ui.Components;
public final class hk0 extends cg.b {
    public final ng.q0 f27557c;

    public hk0(int i10, ng.q0 q0Var) {
        super(i10, false);
        this.f27557c = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hk0.class == obj.getClass()) {
            hk0 hk0Var = (hk0) obj;
            int i10 = this.f2505a;
            int i11 = hk0Var.f2505a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                ng.q0 q0Var = this.f27557c;
                if (q0Var != null && q0Var.equals(hk0Var.f27557c)) {
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
