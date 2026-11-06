package org.telegram.ui.Components;
public final class y90 extends mi.l {
    public int W;
    public Runnable X;
    public final ca0 Y;

    public y90(ca0 ca0Var, bi.q1 q1Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(null, q1Var, f6Var);
        this.Y = ca0Var;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        x90 x90Var = new x90(this, 0);
        this.X = x90Var;
        org.telegram.messenger.g0.h3(x90Var);
        ca0 ca0Var = this.Y;
        if (ca0Var.V) {
            ca0Var.V = false;
            org.telegram.messenger.g0.h3(new x90(this, 1));
        }
    }

    @Override
    public final void W() {
        ia0 ia0Var = this.Y.f32494c0;
        org.telegram.messenger.g0.r(ia0Var.D);
        ia0Var.D.run();
        if (this.W == -1) {
            this.W = org.telegram.messenger.qs.f(ia0Var.f34577x).q(null, this.W, false);
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
        x90 x90Var = new x90(this, 2);
        this.X = x90Var;
        org.telegram.messenger.g0.h3(x90Var);
    }
}
