package org.telegram.ui.Components;
public final class z90 extends mi.l {
    public int W;
    public Runnable X;
    public final da0 Y;

    public z90(da0 da0Var, bi.q1 q1Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(null, q1Var, g6Var);
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
        if (da0Var.V) {
            da0Var.V = false;
            org.telegram.messenger.g0.h3(new y90(this, 1));
        }
    }

    @Override
    public final void W() {
        ja0 ja0Var = this.Y.f32920c0;
        org.telegram.messenger.g0.r(ja0Var.D);
        ja0Var.D.run();
        if (this.W == -1) {
            this.W = org.telegram.messenger.qs.f(ja0Var.f34979x).q(null, this.W, false);
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
