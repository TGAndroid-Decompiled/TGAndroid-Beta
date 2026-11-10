package org.telegram.ui;
public final class dj implements Runnable {
    public final int f44998a;
    public final ej f44999b;

    public dj(ej ejVar, int i7) {
        this.f44998a = i7;
        this.f44999b = ejVar;
    }

    @Override
    public final void run() {
        switch (this.f44998a) {
            case 0:
                ej ejVar = this.f44999b;
                ejVar.W = null;
                cn cnVar = ejVar.X;
                if (cnVar.f44457ca != -1) {
                    cnVar.getNotificationCenter().j(cnVar.f44457ca);
                    cnVar.f44457ca = -1;
                }
                if (org.telegram.messenger.r2.f25216a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                ej ejVar2 = this.f44999b;
                ejVar2.W = null;
                cn cnVar2 = ejVar2.X;
                if (cnVar2.f44457ca != -1) {
                    cnVar2.getNotificationCenter().j(cnVar2.f44457ca);
                    cnVar2.f44457ca = -1;
                }
                if (org.telegram.messenger.r2.f25216a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
