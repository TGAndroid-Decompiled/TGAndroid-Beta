package org.telegram.ui;
public final class im extends vf.b {
    public final org.telegram.ui.Cells.r1 d;
    public final mm f48753e;

    public im(mm mmVar, org.telegram.ui.Cells.r1 r1Var) {
        this.f48753e = mmVar;
        this.d = r1Var;
    }

    @Override
    public final void c(boolean z10) {
        if (!z10) {
            org.telegram.messenger.g0.h3(new fj(this.f48753e.f49896a, 9), 250L);
        }
    }

    @Override
    public final void d() {
        mm mmVar = this.f48753e;
        bn bnVar = mmVar.f49896a;
        org.telegram.ui.Cells.r1 r1Var = this.d;
        bnVar.f45935ac = r1Var.getMessageObject().e1();
        bn bnVar2 = mmVar.f49896a;
        bnVar2.f45950bc = 2;
        bnVar2.f45964cc = null;
        r1Var.invalidate();
    }
}
