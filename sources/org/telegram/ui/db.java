package org.telegram.ui;
public final class db extends mi.l {
    public int W;
    public gq0 X;
    public final mb Y;

    public db(mb mbVar, org.telegram.ui.Components.pj0 pj0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(null, pj0Var, f6Var);
        this.Y = mbVar;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        gq0 gq0Var = this.X;
        if (gq0Var != null) {
            org.telegram.messenger.g0.r(gq0Var);
        }
        gq0 gq0Var2 = new gq0(this, 20);
        this.X = gq0Var2;
        org.telegram.messenger.g0.h3(gq0Var2);
    }

    @Override
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().q(mb.R0, this.W, false);
        }
        gq0 gq0Var = this.X;
        if (gq0Var != null) {
            org.telegram.messenger.g0.r(gq0Var);
            this.X = null;
        }
        if (org.telegram.messenger.r2.f25212a) {
            org.telegram.messenger.a8.b("admin logs chatItemAnimator disable notifications");
        }
    }
}
