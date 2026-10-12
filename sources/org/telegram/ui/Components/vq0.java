package org.telegram.ui.Components;
public final class vq0 extends g.o {
    public final int f32162c;
    public final sr0 d;

    public vq0(sr0 sr0Var, int i10) {
        this.f32162c = i10;
        this.d = sr0Var;
    }

    @Override
    public final int i(int i10) {
        switch (this.f32162c) {
            case 0:
                if (i10 == 0) {
                    return this.d.H.J;
                }
                return 1;
            case 1:
                or0 or0Var = this.d.M;
                if (i10 != or0Var.f29282w && i10 != or0Var.f29283x && i10 != or0Var.f29284y && i10 != or0Var.F && or0Var.j(i10) != 0) {
                    return 1;
                }
                return 4;
            default:
                if (i10 == 0) {
                    return this.d.I.J;
                }
                return 1;
        }
    }
}
