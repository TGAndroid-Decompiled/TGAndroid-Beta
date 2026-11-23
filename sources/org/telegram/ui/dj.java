package org.telegram.ui;
public final class dj extends pi.k {
    public Runnable W;
    public final bn X;

    public dj(bn bnVar, bn bnVar2, bj bjVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(bnVar2, bjVar, h6Var);
        this.X = bnVar;
    }

    @Override
    public final void F() {
        bn bnVar = this.X;
        if (bnVar.f46016ea == -1) {
            bnVar.f46016ea = bnVar.getNotificationCenter().q(bn.f45946sd, bnVar.f46016ea, false);
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
        bnVar.f46016ea = bnVar.getNotificationCenter().q(bn.f45946sd, bnVar.f46016ea, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.W = null;
        }
        if (org.telegram.messenger.s2.f26730a) {
            org.telegram.messenger.a8.b("chatItemAnimator disable notifications");
        }
        j6.o oVar = bnVar.f45950a0.getAdjustPanLayoutHelper().h;
        org.telegram.messenger.g0.r(oVar);
        oVar.run();
        org.telegram.ui.Components.te teVar = bnVar.f45950a0.O4;
        org.telegram.messenger.g0.r(teVar);
        teVar.run();
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
