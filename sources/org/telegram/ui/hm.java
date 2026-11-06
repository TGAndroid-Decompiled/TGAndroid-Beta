package org.telegram.ui;
public final class hm extends vf.b {
    public final org.telegram.ui.Cells.q1 d;
    public final lm f46429e;

    public hm(lm lmVar, org.telegram.ui.Cells.q1 q1Var) {
        this.f46429e = lmVar;
        this.d = q1Var;
    }

    @Override
    public final void c(boolean z9) {
        if (!z9) {
            org.telegram.messenger.g0.i3(new ej(this.f46429e.f47534a, 9), 250L);
        }
    }

    @Override
    public final void d() {
        lm lmVar = this.f46429e;
        an anVar = lmVar.f47534a;
        org.telegram.ui.Cells.q1 q1Var = this.d;
        anVar.Wb = q1Var.getMessageObject().f1();
        an anVar2 = lmVar.f47534a;
        anVar2.Xb = 2;
        anVar2.Yb = null;
        q1Var.invalidate();
    }
}
