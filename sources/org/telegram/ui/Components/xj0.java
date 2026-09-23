package org.telegram.ui.Components;
public final class xj0 extends og.a {
    public final zg.p0 f30001c;

    public xj0(int i10, zg.p0 p0Var) {
        super(i10, false);
        this.f30001c = p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xj0.class == obj.getClass()) {
            xj0 xj0Var = (xj0) obj;
            int i10 = this.f15508a;
            int i11 = xj0Var.f15508a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                zg.p0 p0Var = this.f30001c;
                if (p0Var != null && p0Var.equals(xj0Var.f30001c)) {
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
