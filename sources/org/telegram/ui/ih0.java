package org.telegram.ui;
public final class ih0 extends ci.o {
    public Runnable W;

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
            this.W = null;
        }
        hh0 hh0Var = new hh0(this, 0);
        this.W = hh0Var;
        org.telegram.messenger.i0.g3(hh0Var);
    }

    @Override
    public final void W() {
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
            this.W = null;
        }
        if (org.telegram.messenger.v2.f18448a) {
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
        hh0 hh0Var = new hh0(this, 1);
        this.W = hh0Var;
        org.telegram.messenger.i0.g3(hh0Var);
    }

    @Override
    public final void F() {
    }
}
