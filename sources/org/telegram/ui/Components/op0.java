package org.telegram.ui.Components;
public final class op0 extends f2.v {
    public final int f29835c;
    public final mq0 d;

    public op0(mq0 mq0Var, int i10) {
        this.f29835c = i10;
        this.d = mq0Var;
    }

    @Override
    public final int i(int i10) {
        switch (this.f29835c) {
            case 0:
                if (i10 == 0) {
                    return this.d.E.J;
                }
                return 1;
            case 1:
                iq0 iq0Var = this.d.J;
                if (i10 != iq0Var.f27889w && i10 != iq0Var.f27890x && i10 != iq0Var.f27891y && i10 != iq0Var.C && iq0Var.j(i10) != 0) {
                    return 1;
                }
                return 4;
            default:
                if (i10 == 0) {
                    return this.d.F.J;
                }
                return 1;
        }
    }
}
