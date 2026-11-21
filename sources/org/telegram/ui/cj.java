package org.telegram.ui;
public final class cj implements Runnable {
    public final int f46582a;
    public final dj f46583b;

    public cj(dj djVar, int i7) {
        this.f46582a = i7;
        this.f46583b = djVar;
    }

    @Override
    public final void run() {
        switch (this.f46582a) {
            case 0:
                dj djVar = this.f46583b;
                djVar.W = null;
                bn bnVar = djVar.X;
                if (bnVar.f46012ea != -1) {
                    bnVar.getNotificationCenter().j(bnVar.f46012ea);
                    bnVar.f46012ea = -1;
                }
                if (org.telegram.messenger.s2.f26749a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                dj djVar2 = this.f46583b;
                djVar2.W = null;
                bn bnVar2 = djVar2.X;
                if (bnVar2.f46012ea != -1) {
                    bnVar2.getNotificationCenter().j(bnVar2.f46012ea);
                    bnVar2.f46012ea = -1;
                }
                if (org.telegram.messenger.s2.f26749a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
