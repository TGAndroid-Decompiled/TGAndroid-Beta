package org.telegram.ui;
public final class bg0 implements Runnable {
    public final int f45881a;
    public final cg0 f45882b;

    public bg0(cg0 cg0Var, int i7) {
        this.f45881a = i7;
        this.f45882b = cg0Var;
    }

    @Override
    public final void run() {
        switch (this.f45881a) {
            case 0:
                this.f45882b.W = null;
                if (org.telegram.messenger.s2.f26749a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f45882b.W = null;
                if (org.telegram.messenger.s2.f26749a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
