package org.telegram.ui;
public final class hm extends vf.b {
    public final org.telegram.ui.Cells.q1 d;
    public final lm f47739e;

    public hm(lm lmVar, org.telegram.ui.Cells.q1 q1Var) {
        this.f47739e = lmVar;
        this.d = q1Var;
    }

    @Override
    public final void c(boolean z10) {
        if (!z10) {
            org.telegram.messenger.g0.i3(new ej(this.f47739e.f49005a, 9), 250L);
        }
    }

    @Override
    public final void d() {
        lm lmVar = this.f47739e;
        an anVar = lmVar.f49005a;
        org.telegram.ui.Cells.q1 q1Var = this.d;
        anVar.Zb = q1Var.getMessageObject().e1();
        an anVar2 = lmVar.f49005a;
        anVar2.f45130ac = 2;
        anVar2.f45145bc = null;
        q1Var.invalidate();
    }
}
