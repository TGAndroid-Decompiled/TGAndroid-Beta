package org.telegram.ui.Components;
public final class wk0 extends qg.a {
    public final bh.x0 f34474c;

    public wk0(int i10, bh.x0 x0Var) {
        super(i10, false);
        this.f34474c = x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wk0.class == obj.getClass()) {
            wk0 wk0Var = (wk0) obj;
            int i10 = this.f47040a;
            int i11 = wk0Var.f47040a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                bh.x0 x0Var = this.f34474c;
                if (x0Var != null && x0Var.equals(wk0Var.f34474c)) {
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
