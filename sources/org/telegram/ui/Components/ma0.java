package org.telegram.ui.Components;
public final class ma0 extends pi.k {
    public int W;
    public Runnable X;
    public final qa0 Y;

    public ma0(qa0 qa0Var, di.b1 b1Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(null, b1Var, h6Var);
        this.Y = qa0Var;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        la0 la0Var = new la0(this, 0);
        this.X = la0Var;
        org.telegram.messenger.g0.g3(la0Var);
        qa0 qa0Var = this.Y;
        if (qa0Var.W) {
            qa0Var.W = false;
            org.telegram.messenger.g0.g3(new la0(this, 1));
        }
    }

    @Override
    public final void W() {
        wa0 wa0Var = this.Y.f38864d0;
        org.telegram.messenger.g0.r(wa0Var.E);
        wa0Var.E.run();
        if (this.W == -1) {
            this.W = org.telegram.messenger.ks.f(wa0Var.f41752x).q(null, this.W, false);
        }
        Runnable runnable = this.X;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.X = null;
        }
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.X;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        la0 la0Var = new la0(this, 2);
        this.X = la0Var;
        org.telegram.messenger.g0.g3(la0Var);
    }
}
