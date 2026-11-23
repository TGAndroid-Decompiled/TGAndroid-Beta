package org.telegram.ui;
public final class cj implements Runnable {
    public final int f46816a;
    public final dj f46817b;

    public cj(dj djVar, int i7) {
        this.f46816a = i7;
        this.f46817b = djVar;
    }

    @Override
    public final void run() {
        switch (this.f46816a) {
            case 0:
                dj djVar = this.f46817b;
                djVar.W = null;
                bn bnVar = djVar.X;
                if (bnVar.f46184ea != -1) {
                    bnVar.getNotificationCenter().j(bnVar.f46184ea);
                    bnVar.f46184ea = -1;
                }
                if (org.telegram.messenger.s2.f26829a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                dj djVar2 = this.f46817b;
                djVar2.W = null;
                bn bnVar2 = djVar2.X;
                if (bnVar2.f46184ea != -1) {
                    bnVar2.getNotificationCenter().j(bnVar2.f46184ea);
                    bnVar2.f46184ea = -1;
                }
                if (org.telegram.messenger.s2.f26829a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
