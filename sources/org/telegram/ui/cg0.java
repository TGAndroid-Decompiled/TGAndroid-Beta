package org.telegram.ui;
public final class cg0 extends pi.k {
    public Runnable W;

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.W = null;
        }
        bg0 bg0Var = new bg0(this, 0);
        this.W = bg0Var;
        org.telegram.messenger.g0.g3(bg0Var);
    }

    @Override
    public final void W() {
        Runnable runnable = this.W;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.W = null;
        }
        if (org.telegram.messenger.s2.f26749a) {
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
        bg0 bg0Var = new bg0(this, 1);
        this.W = bg0Var;
        org.telegram.messenger.g0.g3(bg0Var);
    }

    @Override
    public final void F() {
    }
}
