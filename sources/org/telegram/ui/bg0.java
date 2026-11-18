package org.telegram.ui;
public final class bg0 implements Runnable {
    public final int f45861a;
    public final cg0 f45862b;

    public bg0(cg0 cg0Var, int i7) {
        this.f45861a = i7;
        this.f45862b = cg0Var;
    }

    @Override
    public final void run() {
        switch (this.f45861a) {
            case 0:
                this.f45862b.W = null;
                if (org.telegram.messenger.s2.f26723a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f45862b.W = null;
                if (org.telegram.messenger.s2.f26723a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
