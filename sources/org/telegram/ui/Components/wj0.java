package org.telegram.ui.Components;
public final class wj0 extends pg.a {
    public final ah.j1 f32302c;

    public wj0(int i10, ah.j1 j1Var) {
        super(i10, false);
        this.f32302c = j1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wj0.class == obj.getClass()) {
            wj0 wj0Var = (wj0) obj;
            int i10 = this.f44099a;
            int i11 = wj0Var.f44099a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                ah.j1 j1Var = this.f32302c;
                if (j1Var != null && j1Var.equals(wj0Var.f32302c)) {
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
