package org.telegram.ui;
public final class fh0 implements Runnable {
    public final int f37149a;
    public final gh0 f37150b;

    public fh0(gh0 gh0Var, int i10) {
        this.f37149a = i10;
        this.f37150b = gh0Var;
    }

    @Override
    public final void run() {
        switch (this.f37149a) {
            case 0:
                this.f37150b.W = null;
                if (org.telegram.messenger.v2.f18578a) {
                    org.telegram.messenger.f8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f37150b.W = null;
                if (org.telegram.messenger.v2.f18578a) {
                    org.telegram.messenger.f8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
