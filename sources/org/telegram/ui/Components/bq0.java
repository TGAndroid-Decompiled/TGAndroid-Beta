package org.telegram.ui.Components;
public final class bq0 extends g.p {
    public final int f25042c;
    public final zq0 d;

    public bq0(zq0 zq0Var, int i10) {
        this.f25042c = i10;
        this.d = zq0Var;
    }

    @Override
    public final int i(int i10) {
        switch (this.f25042c) {
            case 0:
                if (i10 == 0) {
                    return this.d.H.J;
                }
                return 1;
            case 1:
                vq0 vq0Var = this.d.M;
                if (i10 != vq0Var.f32342w && i10 != vq0Var.f32343x && i10 != vq0Var.f32344y && i10 != vq0Var.F && vq0Var.j(i10) != 0) {
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
