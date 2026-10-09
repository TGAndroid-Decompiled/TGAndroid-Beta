package org.telegram.ui.Components;
public final class bl0 extends og.a {
    public final zg.n0 f25046c;

    public bl0(int i10, zg.n0 n0Var) {
        super(i10, false);
        this.f25046c = n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bl0.class == obj.getClass()) {
            bl0 bl0Var = (bl0) obj;
            int i10 = this.f17125a;
            int i11 = bl0Var.f17125a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                zg.n0 n0Var = this.f25046c;
                if (n0Var != null && n0Var.equals(bl0Var.f25046c)) {
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
