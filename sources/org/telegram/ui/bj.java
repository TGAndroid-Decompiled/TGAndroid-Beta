package org.telegram.ui;
public final class bj implements Runnable {
    public final int f45769a;
    public final cj f45770b;

    public bj(cj cjVar, int i7) {
        this.f45769a = i7;
        this.f45770b = cjVar;
    }

    @Override
    public final void run() {
        switch (this.f45769a) {
            case 0:
                cj cjVar = this.f45770b;
                cjVar.W = null;
                an anVar = cjVar.X;
                if (anVar.f45169da != -1) {
                    anVar.getNotificationCenter().j(anVar.f45169da);
                    anVar.f45169da = -1;
                }
                if (org.telegram.messenger.r2.f26206a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                cj cjVar2 = this.f45770b;
                cjVar2.W = null;
                an anVar2 = cjVar2.X;
                if (anVar2.f45169da != -1) {
                    anVar2.getNotificationCenter().j(anVar2.f45169da);
                    anVar2.f45169da = -1;
                }
                if (org.telegram.messenger.r2.f26206a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
