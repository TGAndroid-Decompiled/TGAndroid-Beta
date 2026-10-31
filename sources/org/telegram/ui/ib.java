package org.telegram.ui;
public final class ib extends ci.o {
    public int W;
    public rr0 X;
    public final sb Y;

    public ib(sb sbVar, org.telegram.ui.Components.tk0 tk0Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(null, tk0Var, p6Var);
        this.Y = sbVar;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        rr0 rr0Var = this.X;
        if (rr0Var != null) {
            org.telegram.messenger.i0.r(rr0Var);
        }
        rr0 rr0Var2 = new rr0(this, 20);
        this.X = rr0Var2;
        org.telegram.messenger.i0.g3(rr0Var2);
    }

    @Override
    public final void W() {
        if (this.W == -1) {
            this.W = this.Y.getNotificationCenter().q(sb.R0, this.W, false);
        }
        rr0 rr0Var = this.X;
        if (rr0Var != null) {
            org.telegram.messenger.i0.r(rr0Var);
            this.X = null;
        }
        if (org.telegram.messenger.v2.f18448a) {
            org.telegram.messenger.f8.b("admin logs chatItemAnimator disable notifications");
        }
    }
}
