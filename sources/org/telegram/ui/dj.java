package org.telegram.ui;
public final class dj implements Runnable {
    public final int f44988a;
    public final ej f44989b;

    public dj(ej ejVar, int i7) {
        this.f44988a = i7;
        this.f44989b = ejVar;
    }

    @Override
    public final void run() {
        switch (this.f44988a) {
            case 0:
                ej ejVar = this.f44989b;
                ejVar.W = null;
                cn cnVar = ejVar.X;
                if (cnVar.f44416ca != -1) {
                    cnVar.getNotificationCenter().j(cnVar.f44416ca);
                    cnVar.f44416ca = -1;
                }
                if (org.telegram.messenger.r2.f25212a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                ej ejVar2 = this.f44989b;
                ejVar2.W = null;
                cn cnVar2 = ejVar2.X;
                if (cnVar2.f44416ca != -1) {
                    cnVar2.getNotificationCenter().j(cnVar2.f44416ca);
                    cnVar2.f44416ca = -1;
                }
                if (org.telegram.messenger.r2.f25212a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
