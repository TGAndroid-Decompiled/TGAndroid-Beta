package org.telegram.ui.Components;
public final class ka0 extends pi.k {
    public int W;
    public Runnable X;
    public final oa0 Y;

    public ka0(oa0 oa0Var, di.b1 b1Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(null, b1Var, i6Var);
        this.Y = oa0Var;
        this.W = -1;
    }

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.X;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        ja0 ja0Var = new ja0(this, 0);
        this.X = ja0Var;
        org.telegram.messenger.g0.g3(ja0Var);
        oa0 oa0Var = this.Y;
        if (oa0Var.W) {
            oa0Var.W = false;
            org.telegram.messenger.g0.g3(new ja0(this, 1));
        }
    }

    @Override
    public final void W() {
        ua0 ua0Var = this.Y.f38045d0;
        org.telegram.messenger.g0.r(ua0Var.E);
        ua0Var.E.run();
        if (this.W == -1) {
            this.W = org.telegram.messenger.ks.f(ua0Var.f40286x).q(null, this.W, false);
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
        ja0 ja0Var = new ja0(this, 2);
        this.X = ja0Var;
        org.telegram.messenger.g0.g3(ja0Var);
    }
}
