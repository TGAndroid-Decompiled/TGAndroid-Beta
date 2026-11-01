package org.telegram.ui.Components;
public final class bj implements Runnable {
    public final int f24844a;
    public final dj f24845b;

    public bj(dj djVar, int i10) {
        this.f24844a = i10;
        this.f24845b = djVar;
    }

    @Override
    public final void run() {
        switch (this.f24844a) {
            case 0:
                dj djVar = this.f24845b;
                if (djVar.f25498f != null) {
                    djVar.f25502w = org.telegram.messenger.m5.h(new StringBuilder("+"), djVar.f25498f.phone, af.b.c());
                    djVar.f25501s = djVar.f25498f;
                    org.telegram.messenger.i0.g3(new bj(djVar, 1));
                    return;
                }
                return;
            default:
                dj djVar2 = this.f24845b;
                djVar2.f25497c.l(djVar2.f25502w, false);
                return;
        }
    }
}
