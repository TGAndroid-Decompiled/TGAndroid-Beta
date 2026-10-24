package org.telegram.ui.Components;
public final class wk0 extends pg.a {
    public final ah.i1 f32262c;

    public wk0(int i10, ah.i1 i1Var) {
        super(i10, false);
        this.f32262c = i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wk0.class == obj.getClass()) {
            wk0 wk0Var = (wk0) obj;
            int i10 = this.f44712a;
            int i11 = wk0Var.f44712a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                ah.i1 i1Var = this.f32262c;
                if (i1Var != null && i1Var.equals(wk0Var.f32262c)) {
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
