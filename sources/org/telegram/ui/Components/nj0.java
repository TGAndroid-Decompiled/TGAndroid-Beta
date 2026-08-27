package org.telegram.ui.Components;

public final class nj0 extends xf.a {

    public final ig.q0 f30984c;

    public nj0(int i10, ig.q0 q0Var) {
        super(i10, false);
        this.f30984c = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nj0.class == obj.getClass()) {
            nj0 nj0Var = (nj0) obj;
            int i10 = this.f49413a;
            int i11 = nj0Var.f49413a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                ig.q0 q0Var = this.f30984c;
                return q0Var != null && q0Var.equals(nj0Var.f30984c);
            }
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }
}
