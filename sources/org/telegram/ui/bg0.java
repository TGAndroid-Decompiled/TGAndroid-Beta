package org.telegram.ui;
public final class bg0 extends mi.l {
    public Runnable W;

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.W = null;
        }
        ag0 ag0Var = new ag0(this, 0);
        this.W = ag0Var;
        org.telegram.messenger.g0.h3(ag0Var);
    }

    @Override
    public final void W() {
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.W = null;
        }
        if (org.telegram.messenger.r2.f25212a) {
            org.telegram.messenger.a8.b("chatItemAnimator disable notifications");
        }
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        ag0 ag0Var = new ag0(this, 1);
        this.W = ag0Var;
        org.telegram.messenger.g0.h3(ag0Var);
    }

    @Override
    public final void F() {
    }
}
