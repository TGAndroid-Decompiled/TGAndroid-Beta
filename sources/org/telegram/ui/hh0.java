package org.telegram.ui;
public final class hh0 implements Runnable {
    public final int f37966a;
    public final ih0 f37967b;

    public hh0(ih0 ih0Var, int i10) {
        this.f37966a = i10;
        this.f37967b = ih0Var;
    }

    @Override
    public final void run() {
        switch (this.f37966a) {
            case 0:
                this.f37967b.W = null;
                if (org.telegram.messenger.v2.f18448a) {
                    org.telegram.messenger.f8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f37967b.W = null;
                if (org.telegram.messenger.v2.f18448a) {
                    org.telegram.messenger.f8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
