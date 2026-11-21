package org.telegram.ui;
public final class im extends vf.b {
    public final org.telegram.ui.Cells.r1 d;
    public final mm f48775e;

    public im(mm mmVar, org.telegram.ui.Cells.r1 r1Var) {
        this.f48775e = mmVar;
        this.d = r1Var;
    }

    @Override
    public final void c(boolean z10) {
        if (!z10) {
            org.telegram.messenger.g0.h3(new fj(this.f48775e.f49937a, 9), 250L);
        }
    }

    @Override
    public final void d() {
        mm mmVar = this.f48775e;
        bn bnVar = mmVar.f49937a;
        org.telegram.ui.Cells.r1 r1Var = this.d;
        bnVar.f45958ac = r1Var.getMessageObject().e1();
        bn bnVar2 = mmVar.f49937a;
        bnVar2.f45973bc = 2;
        bnVar2.f45987cc = null;
        r1Var.invalidate();
    }
}
