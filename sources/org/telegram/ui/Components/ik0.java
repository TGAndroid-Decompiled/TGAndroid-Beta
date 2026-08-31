package org.telegram.ui.Components;
public final class ik0 extends cg.b {
    public final ng.q0 f27851c;

    public ik0(int i10, ng.q0 q0Var) {
        super(i10, false);
        this.f27851c = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ik0.class == obj.getClass()) {
            ik0 ik0Var = (ik0) obj;
            int i10 = this.f2505a;
            int i11 = ik0Var.f2505a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                ng.q0 q0Var = this.f27851c;
                if (q0Var != null && q0Var.equals(ik0Var.f27851c)) {
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
