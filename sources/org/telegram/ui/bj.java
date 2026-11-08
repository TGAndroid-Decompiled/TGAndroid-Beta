package org.telegram.ui;
public final class bj implements Runnable {
    public final int f44359a;
    public final cj f44360b;

    public bj(cj cjVar, int i7) {
        this.f44359a = i7;
        this.f44360b = cjVar;
    }

    @Override
    public final void run() {
        switch (this.f44359a) {
            case 0:
                cj cjVar = this.f44360b;
                cjVar.W = null;
                an anVar = cjVar.X;
                if (anVar.f43732aa != -1) {
                    anVar.getNotificationCenter().j(anVar.f43732aa);
                    anVar.f43732aa = -1;
                }
                if (org.telegram.messenger.r2.f25212a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                cj cjVar2 = this.f44360b;
                cjVar2.W = null;
                an anVar2 = cjVar2.X;
                if (anVar2.f43732aa != -1) {
                    anVar2.getNotificationCenter().j(anVar2.f43732aa);
                    anVar2.f43732aa = -1;
                }
                if (org.telegram.messenger.r2.f25212a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
