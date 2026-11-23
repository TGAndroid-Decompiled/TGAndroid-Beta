package org.telegram.ui;
public final class ag0 implements Runnable {
    public final int f45714a;
    public final bg0 f45715b;

    public ag0(bg0 bg0Var, int i7) {
        this.f45714a = i7;
        this.f45715b = bg0Var;
    }

    @Override
    public final void run() {
        switch (this.f45714a) {
            case 0:
                this.f45715b.W = null;
                if (org.telegram.messenger.s2.f26829a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f45715b.W = null;
                if (org.telegram.messenger.s2.f26829a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
