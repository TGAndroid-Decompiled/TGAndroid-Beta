package org.telegram.ui;
public final class cj implements Runnable {
    public final int f46585a;
    public final dj f46586b;

    public cj(dj djVar, int i7) {
        this.f46585a = i7;
        this.f46586b = djVar;
    }

    @Override
    public final void run() {
        switch (this.f46585a) {
            case 0:
                dj djVar = this.f46586b;
                djVar.W = null;
                bn bnVar = djVar.X;
                if (bnVar.f46016ea != -1) {
                    bnVar.getNotificationCenter().j(bnVar.f46016ea);
                    bnVar.f46016ea = -1;
                }
                if (org.telegram.messenger.s2.f26730a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                dj djVar2 = this.f46586b;
                djVar2.W = null;
                bn bnVar2 = djVar2.X;
                if (bnVar2.f46016ea != -1) {
                    bnVar2.getNotificationCenter().j(bnVar2.f46016ea);
                    bnVar2.f46016ea = -1;
                }
                if (org.telegram.messenger.s2.f26730a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
