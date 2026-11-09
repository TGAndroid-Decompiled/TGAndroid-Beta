package org.telegram.ui;
public final class ag0 implements Runnable {
    public final int f43684a;
    public final bg0 f43685b;

    public ag0(bg0 bg0Var, int i7) {
        this.f43684a = i7;
        this.f43685b = bg0Var;
    }

    @Override
    public final void run() {
        switch (this.f43684a) {
            case 0:
                this.f43685b.W = null;
                if (org.telegram.messenger.r2.f25212a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f43685b.W = null;
                if (org.telegram.messenger.r2.f25212a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
