package org.telegram.ui.Components;
public final class z90 extends pi.k {
    public int W;
    public Runnable X;
    public final da0 Y;

    public z90(da0 da0Var, di.c1 c1Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(null, c1Var, e6Var);
        this.Y = da0Var;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        y90 y90Var = new y90(this, 0);
        this.X = y90Var;
        org.telegram.messenger.g0.h3(y90Var);
        da0 da0Var = this.Y;
        if (da0Var.W) {
            da0Var.W = false;
            org.telegram.messenger.g0.h3(new y90(this, 1));
        }
    }

    @Override
    public final void W() {
        ja0 ja0Var = this.Y.f33900d0;
        org.telegram.messenger.g0.r(ja0Var.E);
        ja0Var.E.run();
        if (this.W == -1) {
            this.W = org.telegram.messenger.ns.f(ja0Var.f35957x).q(null, this.W, false);
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
        y90 y90Var = new y90(this, 2);
        this.X = y90Var;
        org.telegram.messenger.g0.h3(y90Var);
    }
}
