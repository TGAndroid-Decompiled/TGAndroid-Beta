package org.telegram.ui;
public final class jm extends vf.b {
    public final org.telegram.ui.Cells.q1 d;
    public final nm f47035e;

    public jm(nm nmVar, org.telegram.ui.Cells.q1 q1Var) {
        this.f47035e = nmVar;
        this.d = q1Var;
    }

    @Override
    public final void c(boolean z9) {
        if (!z9) {
            org.telegram.messenger.g0.i3(new gj(this.f47035e.f48207a, 9), 250L);
        }
    }

    @Override
    public final void d() {
        nm nmVar = this.f47035e;
        cn cnVar = nmVar.f48207a;
        org.telegram.ui.Cells.q1 q1Var = this.d;
        cnVar.Yb = q1Var.getMessageObject().e1();
        cn cnVar2 = nmVar.f48207a;
        cnVar2.Zb = 2;
        cnVar2.f44389ac = null;
        q1Var.invalidate();
    }
}
