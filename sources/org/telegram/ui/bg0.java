package org.telegram.ui;
public final class bg0 implements Runnable {
    public final int f45885a;
    public final cg0 f45886b;

    public bg0(cg0 cg0Var, int i7) {
        this.f45885a = i7;
        this.f45886b = cg0Var;
    }

    @Override
    public final void run() {
        switch (this.f45885a) {
            case 0:
                this.f45886b.W = null;
                if (org.telegram.messenger.s2.f26730a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f45886b.W = null;
                if (org.telegram.messenger.s2.f26730a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
