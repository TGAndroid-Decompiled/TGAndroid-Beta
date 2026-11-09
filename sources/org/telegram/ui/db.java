package org.telegram.ui;
public final class db extends mi.l {
    public int W;
    public iq0 X;
    public final mb Y;

    public db(mb mbVar, org.telegram.ui.Components.qj0 qj0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(null, qj0Var, g6Var);
        this.Y = mbVar;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        iq0 iq0Var = this.X;
        if (iq0Var != null) {
            org.telegram.messenger.g0.r(iq0Var);
        }
        iq0 iq0Var2 = new iq0(this, 20);
        this.X = iq0Var2;
        org.telegram.messenger.g0.h3(iq0Var2);
    }

    @Override
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().q(mb.R0, this.W, false);
        }
        iq0 iq0Var = this.X;
        if (iq0Var != null) {
            org.telegram.messenger.g0.r(iq0Var);
            this.X = null;
        }
        if (org.telegram.messenger.r2.f25212a) {
            org.telegram.messenger.a8.b("admin logs chatItemAnimator disable notifications");
        }
    }
}
