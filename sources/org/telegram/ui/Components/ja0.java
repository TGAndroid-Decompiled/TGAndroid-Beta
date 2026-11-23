package org.telegram.ui.Components;
public final class ja0 extends pi.k {
    public int W;
    public Runnable X;
    public final na0 Y;

    public ja0(na0 na0Var, di.b1 b1Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(null, b1Var, i6Var);
        this.Y = na0Var;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        ia0 ia0Var = new ia0(this, 0);
        this.X = ia0Var;
        org.telegram.messenger.g0.g3(ia0Var);
        na0 na0Var = this.Y;
        if (na0Var.W) {
            na0Var.W = false;
            org.telegram.messenger.g0.g3(new ia0(this, 1));
        }
    }

    @Override
    public final void W() {
        ta0 ta0Var = this.Y.f37742d0;
        org.telegram.messenger.g0.r(ta0Var.E);
        ta0Var.E.run();
        if (this.W == -1) {
            this.W = org.telegram.messenger.ks.f(ta0Var.f39890x).q(null, this.W, false);
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
        ia0 ia0Var = new ia0(this, 2);
        this.X = ia0Var;
        org.telegram.messenger.g0.g3(ia0Var);
    }
}
