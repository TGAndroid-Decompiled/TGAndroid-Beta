package org.telegram.ui;
public final class im extends vf.b {
    public final org.telegram.ui.Cells.r1 d;
    public final mm f48779e;

    public im(mm mmVar, org.telegram.ui.Cells.r1 r1Var) {
        this.f48779e = mmVar;
        this.d = r1Var;
    }

    @Override
    public final void c(boolean z10) {
        if (!z10) {
            org.telegram.messenger.g0.h3(new fj(this.f48779e.f49941a, 9), 250L);
        }
    }

    @Override
    public final void d() {
        mm mmVar = this.f48779e;
        bn bnVar = mmVar.f49941a;
        org.telegram.ui.Cells.r1 r1Var = this.d;
        bnVar.f45962ac = r1Var.getMessageObject().e1();
        bn bnVar2 = mmVar.f49941a;
        bnVar2.f45977bc = 2;
        bnVar2.f45991cc = null;
        r1Var.invalidate();
    }
}
