package org.telegram.ui;
public final class dj extends pi.k {
    public Runnable W;
    public final bn X;

    public dj(bn bnVar, bn bnVar2, bj bjVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(bnVar2, bjVar, i6Var);
        this.X = bnVar;
    }

    @Override
    public final void F() {
        bn bnVar = this.X;
        if (bnVar.f46184ea == -1) {
            bnVar.f46184ea = bnVar.getNotificationCenter().q(bn.f46114sd, bnVar.f46184ea, false);
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
        cj cjVar = new cj(this, 1);
        this.W = cjVar;
        org.telegram.messenger.g0.g3(cjVar);
    }

    @Override
    public final void W() {
        bn bnVar = this.X;
        bnVar.f46184ea = bnVar.getNotificationCenter().q(bn.f46114sd, bnVar.f46184ea, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.W = null;
        }
        if (org.telegram.messenger.s2.f26829a) {
            org.telegram.messenger.a8.b("chatItemAnimator disable notifications");
        }
        i6.g gVar = bnVar.f46118a0.getAdjustPanLayoutHelper().h;
        org.telegram.messenger.g0.r(gVar);
        gVar.run();
        org.telegram.ui.Components.ue ueVar = bnVar.f46118a0.O4;
        org.telegram.messenger.g0.r(ueVar);
        ueVar.run();
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        cj cjVar = new cj(this, 0);
        this.W = cjVar;
        org.telegram.messenger.g0.g3(cjVar);
    }
}
