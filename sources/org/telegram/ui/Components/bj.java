package org.telegram.ui.Components;
public final class bj implements Runnable {
    public final int f32276a;
    public final dj f32277b;

    public bj(dj djVar, int i7) {
        this.f32276a = i7;
        this.f32277b = djVar;
    }

    @Override
    public final void run() {
        switch (this.f32276a) {
            case 0:
                dj djVar = this.f32277b;
                if (djVar.f33005f != null) {
                    djVar.f33009w = org.telegram.messenger.k5.i(new StringBuilder("+"), djVar.f33005f.phone, pf.b.c());
                    djVar.f33008s = djVar.f33005f;
                    org.telegram.messenger.g0.h3(new bj(djVar, 1));
                    return;
                }
                return;
            default:
                dj djVar2 = this.f32277b;
                djVar2.f33003c.l(djVar2.f33009w, false);
                return;
        }
    }
}
