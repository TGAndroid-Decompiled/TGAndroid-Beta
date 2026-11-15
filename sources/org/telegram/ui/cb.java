package org.telegram.ui;
public final class cb extends pi.k {
    public int W;
    public fq0 X;
    public final lb Y;

    public cb(lb lbVar, org.telegram.ui.Components.uj0 uj0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(null, uj0Var, e6Var);
        this.Y = lbVar;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        fq0 fq0Var = this.X;
        if (fq0Var != null) {
            org.telegram.messenger.g0.r(fq0Var);
        }
        fq0 fq0Var2 = new fq0(this, 20);
        this.X = fq0Var2;
        org.telegram.messenger.g0.h3(fq0Var2);
    }

    @Override
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().q(lb.S0, this.W, false);
        }
        fq0 fq0Var = this.X;
        if (fq0Var != null) {
            org.telegram.messenger.g0.r(fq0Var);
            this.X = null;
        }
        if (org.telegram.messenger.r2.f26206a) {
            org.telegram.messenger.a8.b("admin logs chatItemAnimator disable notifications");
        }
    }
}
