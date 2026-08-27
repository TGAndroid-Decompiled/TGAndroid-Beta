package org.telegram.ui.Components;

public final class to0 extends f2.w {

    public final int f32847c;
    public final sp0 d;

    public to0(sp0 sp0Var, int i10) {
        this.f32847c = i10;
        this.d = sp0Var;
    }

    @Override
    public final int i(int i10) {
        switch (this.f32847c) {
            case 0:
                if (i10 == 0) {
                    return this.d.D.J;
                }
                return 1;
            case 1:
                op0 op0Var = this.d.I;
                return (i10 == op0Var.f31380w || i10 == op0Var.f31381x || i10 == op0Var.f31382y || i10 == op0Var.B || op0Var.j(i10) == 0) ? 4 : 1;
            default:
                if (i10 == 0) {
                    return this.d.E.J;
                }
                return 1;
        }
    }
}
