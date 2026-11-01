package org.telegram.ui;
public final class gh0 extends ci.o {
    public Runnable W;

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
            this.W = null;
        }
        fh0 fh0Var = new fh0(this, 0);
        this.W = fh0Var;
        org.telegram.messenger.i0.g3(fh0Var);
    }

    @Override
    public final void W() {
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
            this.W = null;
        }
        if (org.telegram.messenger.v2.f18578a) {
            org.telegram.messenger.f8.b("chatItemAnimator disable notifications");
        }
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
        }
        fh0 fh0Var = new fh0(this, 1);
        this.W = fh0Var;
        org.telegram.messenger.i0.g3(fh0Var);
    }

    @Override
    public final void F() {
    }
}
