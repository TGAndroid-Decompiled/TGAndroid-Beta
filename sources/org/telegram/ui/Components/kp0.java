package org.telegram.ui.Components;
public final class kp0 extends g.p {
    public final int f27886c;
    public final hq0 d;

    public kp0(hq0 hq0Var, int i10) {
        this.f27886c = i10;
        this.d = hq0Var;
    }

    @Override
    public final int i(int i10) {
        switch (this.f27886c) {
            case 0:
                if (i10 == 0) {
                    return this.d.H.J;
                }
                return 1;
            case 1:
                dq0 dq0Var = this.d.M;
                if (i10 != dq0Var.f25447w && i10 != dq0Var.f25448x && i10 != dq0Var.f25449y && i10 != dq0Var.F && dq0Var.j(i10) != 0) {
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
