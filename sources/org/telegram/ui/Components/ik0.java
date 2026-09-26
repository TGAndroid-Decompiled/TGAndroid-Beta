package org.telegram.ui.Components;
public final class ik0 extends og.a {
    public final zg.o0 f25119c;

    public ik0(int i10, zg.o0 o0Var) {
        super(i10, false);
        this.f25119c = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ik0.class == obj.getClass()) {
            ik0 ik0Var = (ik0) obj;
            int i10 = this.f15715a;
            int i11 = ik0Var.f15715a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                zg.o0 o0Var = this.f25119c;
                if (o0Var != null && o0Var.equals(ik0Var.f25119c)) {
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
