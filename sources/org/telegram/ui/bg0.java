package org.telegram.ui;
public final class bg0 implements Runnable {
    public final int f45833a;
    public final cg0 f45834b;

    public bg0(cg0 cg0Var, int i7) {
        this.f45833a = i7;
        this.f45834b = cg0Var;
    }

    @Override
    public final void run() {
        switch (this.f45833a) {
            case 0:
                this.f45834b.W = null;
                if (org.telegram.messenger.s2.f26694a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f45834b.W = null;
                if (org.telegram.messenger.s2.f26694a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
