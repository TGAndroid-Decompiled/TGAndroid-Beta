package org.telegram.ui.Components;
public final class lj0 extends wf.a {
    public final hg.r0 f30466c;

    public lj0(int i9, hg.r0 r0Var) {
        super(i9, false);
        this.f30466c = r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lj0.class == obj.getClass()) {
            lj0 lj0Var = (lj0) obj;
            int i9 = this.f48814a;
            int i10 = lj0Var.f48814a;
            if (i9 == i10 && (i9 == 0 || i9 == 3)) {
                hg.r0 r0Var = this.f30466c;
                if (r0Var != null && r0Var.equals(lj0Var.f30466c)) {
                    return true;
                }
                return false;
            } else if (i9 == i10) {
                return true;
            }
        }
        return false;
    }
}
