package org.telegram.ui.Components;
public final class aa0 extends pi.k {
    public int W;
    public Runnable X;
    public final ea0 Y;

    public aa0(ea0 ea0Var, di.c1 c1Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(null, c1Var, e6Var);
        this.Y = ea0Var;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        z90 z90Var = new z90(this, 0);
        this.X = z90Var;
        org.telegram.messenger.g0.h3(z90Var);
        ea0 ea0Var = this.Y;
        if (ea0Var.W) {
            ea0Var.W = false;
            org.telegram.messenger.g0.h3(new z90(this, 1));
        }
    }

    @Override
    public final void W() {
        ka0 ka0Var = this.Y.f34260d0;
        org.telegram.messenger.g0.r(ka0Var.E);
        ka0Var.E.run();
        if (this.W == -1) {
            this.W = org.telegram.messenger.ns.f(ka0Var.f36344x).q(null, this.W, false);
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
        z90 z90Var = new z90(this, 2);
        this.X = z90Var;
        org.telegram.messenger.g0.h3(z90Var);
    }
}
