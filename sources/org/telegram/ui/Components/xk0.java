package org.telegram.ui.Components;
public final class xk0 extends pg.a {
    public final ah.i1 f31268c;

    public xk0(int i10, ah.i1 i1Var) {
        super(i10, false);
        this.f31268c = i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xk0.class == obj.getClass()) {
            xk0 xk0Var = (xk0) obj;
            int i10 = this.f43203a;
            int i11 = xk0Var.f43203a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                ah.i1 i1Var = this.f31268c;
                if (i1Var != null && i1Var.equals(xk0Var.f31268c)) {
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
