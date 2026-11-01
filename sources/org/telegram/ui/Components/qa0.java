package org.telegram.ui.Components;
public final class qa0 extends ci.o {
    public int W;
    public Runnable X;
    public final ua0 Y;

    public qa0(ua0 ua0Var, ag.b1 b1Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(null, b1Var, p6Var);
        this.Y = ua0Var;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
        }
        pa0 pa0Var = new pa0(this, 0);
        this.X = pa0Var;
        org.telegram.messenger.i0.g3(pa0Var);
        ua0 ua0Var = this.Y;
        if (ua0Var.V) {
            ua0Var.V = false;
            org.telegram.messenger.i0.g3(new pa0(this, 1));
        }
    }

    @Override
    public final void W() {
        ab0 ab0Var = this.Y.f30915c0;
        org.telegram.messenger.i0.r(ab0Var.D);
        ab0Var.D.run();
        if (this.W == -1) {
            this.W = org.telegram.messenger.at.f(ab0Var.f24344x).q(null, this.W, false);
        }
        Runnable runnable = this.X;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
            this.X = null;
        }
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.X;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
        }
        pa0 pa0Var = new pa0(this, 2);
        this.X = pa0Var;
        org.telegram.messenger.i0.g3(pa0Var);
    }
}
