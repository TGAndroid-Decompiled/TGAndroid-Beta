package org.telegram.ui.Components;
public final class xk0 extends qg.a {
    public final bh.x0 f34790c;

    public xk0(int i10, bh.x0 x0Var) {
        super(i10, false);
        this.f34790c = x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xk0.class == obj.getClass()) {
            xk0 xk0Var = (xk0) obj;
            int i10 = this.f47075a;
            int i11 = xk0Var.f47075a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                bh.x0 x0Var = this.f34790c;
                if (x0Var != null && x0Var.equals(xk0Var.f34790c)) {
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
