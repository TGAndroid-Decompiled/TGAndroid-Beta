package org.telegram.ui;
public final class im extends vf.b {
    public final org.telegram.ui.Cells.q1 d;
    public final mm f48753e;

    public im(mm mmVar, org.telegram.ui.Cells.q1 q1Var) {
        this.f48753e = mmVar;
        this.d = q1Var;
    }

    @Override
    public final void c(boolean z10) {
        if (!z10) {
            org.telegram.messenger.g0.h3(new fj(this.f48753e.f49922a, 9), 250L);
        }
    }

    @Override
    public final void d() {
        mm mmVar = this.f48753e;
        bn bnVar = mmVar.f49922a;
        org.telegram.ui.Cells.q1 q1Var = this.d;
        bnVar.f45944ac = q1Var.getMessageObject().e1();
        bn bnVar2 = mmVar.f49922a;
        bnVar2.f45959bc = 2;
        bnVar2.f45973cc = null;
        q1Var.invalidate();
    }
}
