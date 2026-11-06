package org.telegram.ui;
public final class cj extends mi.l {
    public Runnable W;
    public final an X;

    public cj(an anVar, an anVar2, aj ajVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(anVar2, ajVar, f6Var);
        this.X = anVar;
    }

    @Override
    public final void F() {
        an anVar = this.X;
        if (anVar.f43726aa == -1) {
            anVar.f43726aa = anVar.getNotificationCenter().q(an.f43712od, anVar.f43726aa, false);
        }
    }

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.W = null;
        }
        bj bjVar = new bj(this, 1);
        this.W = bjVar;
        org.telegram.messenger.g0.h3(bjVar);
    }

    @Override
    public final void W() {
        an anVar = this.X;
        anVar.f43726aa = anVar.getNotificationCenter().q(an.f43712od, anVar.f43726aa, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.W = null;
        }
        if (org.telegram.messenger.r2.f25199a) {
            org.telegram.messenger.a8.b("chatItemAnimator disable notifications");
        }
        m.f3 f3Var = anVar.Z.getAdjustPanLayoutHelper().h;
        org.telegram.messenger.g0.r(f3Var);
        f3Var.run();
        org.telegram.ui.Components.je jeVar = anVar.Z.Y3;
        org.telegram.messenger.g0.r(jeVar);
        jeVar.run();
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        bj bjVar = new bj(this, 0);
        this.W = bjVar;
        org.telegram.messenger.g0.h3(bjVar);
    }
}
