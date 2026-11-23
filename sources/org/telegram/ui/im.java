package org.telegram.ui;
public final class im extends vf.b {
    public final org.telegram.ui.Cells.r1 d;
    public final mm f48761e;

    public im(mm mmVar, org.telegram.ui.Cells.r1 r1Var) {
        this.f48761e = mmVar;
        this.d = r1Var;
    }

    @Override
    public final void c(boolean z10) {
        if (!z10) {
            org.telegram.messenger.g0.h3(new fj(this.f48761e.f49910a, 9), 250L);
        }
    }

    @Override
    public final void d() {
        mm mmVar = this.f48761e;
        bn bnVar = mmVar.f49910a;
        org.telegram.ui.Cells.r1 r1Var = this.d;
        bnVar.f45915ac = r1Var.getMessageObject().e1();
        bn bnVar2 = mmVar.f49910a;
        bnVar2.f45930bc = 2;
        bnVar2.f45944cc = null;
        r1Var.invalidate();
    }
}
