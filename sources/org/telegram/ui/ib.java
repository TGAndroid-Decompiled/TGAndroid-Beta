package org.telegram.ui;
public final class ib extends ci.o {
    public int W;
    public qr0 X;
    public final sb Y;

    public ib(sb sbVar, org.telegram.ui.Components.uk0 uk0Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(null, uk0Var, p6Var);
        this.Y = sbVar;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        qr0 qr0Var = this.X;
        if (qr0Var != null) {
            org.telegram.messenger.i0.r(qr0Var);
        }
        qr0 qr0Var2 = new qr0(this, 20);
        this.X = qr0Var2;
        org.telegram.messenger.i0.g3(qr0Var2);
    }

    @Override
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().q(sb.R0, this.W, false);
        }
        qr0 qr0Var = this.X;
        if (qr0Var != null) {
            org.telegram.messenger.i0.r(qr0Var);
            this.X = null;
        }
        if (org.telegram.messenger.v2.f18578a) {
            org.telegram.messenger.f8.b("admin logs chatItemAnimator disable notifications");
        }
    }
}
