package org.telegram.ui.Components;
public final class el0 extends og.a {
    public final zg.n0 f25727c;

    public el0(int i10, zg.n0 n0Var) {
        super(i10, false);
        this.f25727c = n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && el0.class == obj.getClass()) {
            el0 el0Var = (el0) obj;
            int i10 = this.f16877a;
            int i11 = el0Var.f16877a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                zg.n0 n0Var = this.f25727c;
                if (n0Var != null && n0Var.equals(el0Var.f25727c)) {
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
