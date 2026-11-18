package org.telegram.ui;
public final class cg0 implements Runnable {
    public final int f46506a;
    public final dg0 f46507b;

    public cg0(dg0 dg0Var, int i7) {
        this.f46506a = i7;
        this.f46507b = dg0Var;
    }

    @Override
    public final void run() {
        switch (this.f46506a) {
            case 0:
                this.f46507b.W = null;
                if (org.telegram.messenger.s2.f26721a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f46507b.W = null;
                if (org.telegram.messenger.s2.f26721a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
