package org.telegram.ui.Components;
public final class t90 extends ni.l {
    public int W;
    public Runnable X;
    public final x90 Y;

    public t90(x90 x90Var, ci.j1 j1Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(null, j1Var, e6Var);
        this.Y = x90Var;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        s90 s90Var = new s90(this, 0);
        this.X = s90Var;
        org.telegram.messenger.g0.h3(s90Var);
        x90 x90Var = this.Y;
        if (x90Var.W) {
            x90Var.W = false;
            org.telegram.messenger.g0.h3(new s90(this, 1));
        }
    }

    @Override
    public final void W() {
        da0 da0Var = this.Y.f40291d0;
        org.telegram.messenger.g0.r(da0Var.E);
        da0Var.E.run();
        if (this.W == -1) {
            this.W = org.telegram.messenger.hs.f(da0Var.f33042x).q(null, this.W, false);
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
        s90 s90Var = new s90(this, 2);
        this.X = s90Var;
        org.telegram.messenger.g0.h3(s90Var);
    }
}
