package org.telegram.ui.Components;
public final class tk0 extends pg.a {
    public final ah.i1 f30659c;

    public tk0(int i10, ah.i1 i1Var) {
        super(i10, false);
        this.f30659c = i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tk0.class == obj.getClass()) {
            tk0 tk0Var = (tk0) obj;
            int i10 = this.f44334a;
            int i11 = tk0Var.f44334a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                ah.i1 i1Var = this.f30659c;
                if (i1Var != null && i1Var.equals(tk0Var.f30659c)) {
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
