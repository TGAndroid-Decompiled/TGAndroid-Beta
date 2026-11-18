package org.telegram.ui;
public final class dg0 extends pi.k {
    public Runnable W;

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.W = null;
        }
        cg0 cg0Var = new cg0(this, 0);
        this.W = cg0Var;
        org.telegram.messenger.g0.g3(cg0Var);
    }

    @Override
    public final void W() {
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.W = null;
        }
        if (org.telegram.messenger.s2.f26721a) {
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
        cg0 cg0Var = new cg0(this, 1);
        this.W = cg0Var;
        org.telegram.messenger.g0.g3(cg0Var);
    }

    @Override
    public final void F() {
    }
}
