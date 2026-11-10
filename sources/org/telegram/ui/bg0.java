package org.telegram.ui;
public final class bg0 implements Runnable {
    public final int f44057a;
    public final cg0 f44058b;

    public bg0(cg0 cg0Var, int i7) {
        this.f44057a = i7;
        this.f44058b = cg0Var;
    }

    @Override
    public final void run() {
        switch (this.f44057a) {
            case 0:
                this.f44058b.W = null;
                if (org.telegram.messenger.r2.f25216a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f44058b.W = null;
                if (org.telegram.messenger.r2.f25216a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
