package org.telegram.ui.Components;
public final class bj implements Runnable {
    public final int f24786a;
    public final dj f24787b;

    public bj(dj djVar, int i10) {
        this.f24786a = i10;
        this.f24787b = djVar;
    }

    @Override
    public final void run() {
        switch (this.f24786a) {
            case 0:
                dj djVar = this.f24787b;
                if (djVar.f25426f != null) {
                    djVar.f25430w = org.telegram.messenger.m5.h(new StringBuilder("+"), djVar.f25426f.phone, af.b.c());
                    djVar.f25429s = djVar.f25426f;
                    org.telegram.messenger.i0.g3(new bj(djVar, 1));
                    return;
                }
                return;
            default:
                dj djVar2 = this.f24787b;
                djVar2.f25425c.l(djVar2.f25430w, false);
                return;
        }
    }
}
