package org.telegram.ui;
public final class gg1 implements org.telegram.ui.ActionBar.c2 {
    public final int f37192a;
    public final qg1 f37193b;

    public gg1(qg1 qg1Var, int i10) {
        this.f37192a = i10;
        this.f37193b = qg1Var;
    }

    @Override
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f37192a) {
            case 0:
                this.f37193b.finishFragment();
                return;
            case 1:
                qg1 qg1Var = this.f37193b;
                qg1Var.B0();
                qg1Var.finishFragment();
                return;
            case 2:
                qg1 qg1Var2 = this.f37193b;
                qg1Var2.O = "";
                qg1Var2.E0(false);
                return;
            case 3:
                qg1.a0(this.f37193b);
                return;
            default:
                qg1.X(this.f37193b);
                return;
        }
    }
}
