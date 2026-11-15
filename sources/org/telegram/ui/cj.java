package org.telegram.ui;
public final class cj extends pi.k {
    public Runnable W;
    public final an X;

    public cj(an anVar, an anVar2, aj ajVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(anVar2, ajVar, e6Var);
        this.X = anVar;
    }

    @Override
    public final void F() {
        an anVar = this.X;
        if (anVar.f45169da == -1) {
            anVar.f45169da = anVar.getNotificationCenter().q(an.f45113rd, anVar.f45169da, false);
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
        anVar.f45169da = anVar.getNotificationCenter().q(an.f45113rd, anVar.f45169da, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.W = null;
        }
        if (org.telegram.messenger.r2.f26206a) {
            org.telegram.messenger.a8.b("chatItemAnimator disable notifications");
        }
        j6.o oVar = anVar.f45117a0.getAdjustPanLayoutHelper().h;
        org.telegram.messenger.g0.r(oVar);
        oVar.run();
        org.telegram.ui.Components.ke keVar = anVar.f45117a0.G4;
        org.telegram.messenger.g0.r(keVar);
        keVar.run();
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
