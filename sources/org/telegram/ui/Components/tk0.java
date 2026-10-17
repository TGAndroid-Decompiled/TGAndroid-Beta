package org.telegram.ui.Components;
public final class tk0 extends pg.a {
    public final ah.i1 f30652c;

    public tk0(int i10, ah.i1 i1Var) {
        super(i10, false);
        this.f30652c = i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tk0.class == obj.getClass()) {
            tk0 tk0Var = (tk0) obj;
            int i10 = this.f44314a;
            int i11 = tk0Var.f44314a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                ah.i1 i1Var = this.f30652c;
                if (i1Var != null && i1Var.equals(tk0Var.f30652c)) {
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
