package org.telegram.ui.Components;
public final class cl0 extends og.a {
    public final zg.n0 f25384c;

    public cl0(int i10, zg.n0 n0Var) {
        super(i10, false);
        this.f25384c = n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cl0.class == obj.getClass()) {
            cl0 cl0Var = (cl0) obj;
            int i10 = this.f17211a;
            int i11 = cl0Var.f17211a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                zg.n0 n0Var = this.f25384c;
                if (n0Var != null && n0Var.equals(cl0Var.f25384c)) {
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
