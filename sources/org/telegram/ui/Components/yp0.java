package org.telegram.ui.Components;
public final class yp0 extends g.p {
    public final int f30686c;
    public final vq0 d;

    public yp0(vq0 vq0Var, int i10) {
        this.f30686c = i10;
        this.d = vq0Var;
    }

    @Override
    public final int i(int i10) {
        switch (this.f30686c) {
            case 0:
                if (i10 == 0) {
                    return this.d.H.J;
                }
                return 1;
            case 1:
                rq0 rq0Var = this.d.M;
                if (i10 != rq0Var.f28042w && i10 != rq0Var.f28043x && i10 != rq0Var.f28044y && i10 != rq0Var.F && rq0Var.j(i10) != 0) {
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
