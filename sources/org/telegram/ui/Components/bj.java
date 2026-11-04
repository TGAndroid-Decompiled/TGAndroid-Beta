package org.telegram.ui.Components;
public final class bj implements Runnable {
    public final int f32303a;
    public final dj f32304b;

    public bj(dj djVar, int i3) {
        this.f32303a = i3;
        this.f32304b = djVar;
    }

    @Override
    public final void run() {
        switch (this.f32303a) {
            case 0:
                dj djVar = this.f32304b;
                if (djVar.f33114f != null) {
                    djVar.f33118w = org.telegram.messenger.k5.i(new StringBuilder("+"), djVar.f33114f.phone, mf.b.c());
                    djVar.f33117s = djVar.f33114f;
                    org.telegram.messenger.g0.h3(new bj(djVar, 1));
                    return;
                }
                return;
            default:
                dj djVar2 = this.f32304b;
                djVar2.f33112c.l(djVar2.f33118w, false);
                return;
        }
    }
}
