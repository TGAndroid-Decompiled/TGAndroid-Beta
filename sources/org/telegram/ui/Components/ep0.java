package org.telegram.ui.Components;
public final class ep0 extends f2.v {
    public final int f28159c;
    public final dq0 d;

    public ep0(dq0 dq0Var, int i10) {
        this.f28159c = i10;
        this.d = dq0Var;
    }

    @Override
    public final int i(int i10) {
        switch (this.f28159c) {
            case 0:
                if (i10 == 0) {
                    return this.d.D.J;
                }
                return 1;
            case 1:
                zp0 zp0Var = this.d.I;
                if (i10 != zp0Var.f35395w && i10 != zp0Var.f35396x && i10 != zp0Var.f35397y && i10 != zp0Var.B && zp0Var.j(i10) != 0) {
                    return 1;
                }
                return 4;
            default:
                if (i10 == 0) {
                    return this.d.E.J;
                }
                return 1;
        }
    }
}
