package org.telegram.ui;
public final class ej extends mi.l {
    public Runnable W;
    public final cn X;

    public ej(cn cnVar, cn cnVar2, cj cjVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(cnVar2, cjVar, h6Var);
        this.X = cnVar;
    }

    @Override
    public final void F() {
        cn cnVar = this.X;
        if (cnVar.f44457ca == -1) {
            cnVar.f44457ca = cnVar.getNotificationCenter().q(cn.f44414qd, cnVar.f44457ca, false);
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
        dj djVar = new dj(this, 1);
        this.W = djVar;
        org.telegram.messenger.g0.h3(djVar);
    }

    @Override
    public final void W() {
        cn cnVar = this.X;
        cnVar.f44457ca = cnVar.getNotificationCenter().q(cn.f44414qd, cnVar.f44457ca, false);
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.W = null;
        }
        if (org.telegram.messenger.r2.f25216a) {
            org.telegram.messenger.a8.b("chatItemAnimator disable notifications");
        }
        m.f3 f3Var = cnVar.Z.getAdjustPanLayoutHelper().h;
        org.telegram.messenger.g0.r(f3Var);
        f3Var.run();
        org.telegram.ui.Components.ie ieVar = cnVar.Z.Y3;
        org.telegram.messenger.g0.r(ieVar);
        ieVar.run();
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        dj djVar = new dj(this, 0);
        this.W = djVar;
        org.telegram.messenger.g0.h3(djVar);
    }
}
