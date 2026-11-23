package org.telegram.ui;
public final class cj implements Runnable {
    public final int f46568a;
    public final dj f46569b;

    public cj(dj djVar, int i7) {
        this.f46568a = i7;
        this.f46569b = djVar;
    }

    @Override
    public final void run() {
        switch (this.f46568a) {
            case 0:
                dj djVar = this.f46569b;
                djVar.W = null;
                bn bnVar = djVar.X;
                if (bnVar.f45969ea != -1) {
                    bnVar.getNotificationCenter().j(bnVar.f45969ea);
                    bnVar.f45969ea = -1;
                }
                if (org.telegram.messenger.s2.f26694a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                dj djVar2 = this.f46569b;
                djVar2.W = null;
                bn bnVar2 = djVar2.X;
                if (bnVar2.f45969ea != -1) {
                    bnVar2.getNotificationCenter().j(bnVar2.f45969ea);
                    bnVar2.f45969ea = -1;
                }
                if (org.telegram.messenger.s2.f26694a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
