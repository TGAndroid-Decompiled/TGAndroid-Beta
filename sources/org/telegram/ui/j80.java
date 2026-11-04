package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class j80 implements Runnable {
    public final int f46556a;
    public final k80 f46557b;
    public final org.telegram.messenger.c f46558c;
    public final long d;
    public final org.telegram.ui.ActionBar.d2 f46559e;

    public j80(k80 k80Var, org.telegram.messenger.c cVar, long j10, org.telegram.ui.ActionBar.d2 d2Var, int i3) {
        this.f46556a = i3;
        this.f46557b = k80Var;
        this.f46558c = cVar;
        this.d = j10;
        this.f46559e = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f46556a) {
            case 0:
                org.telegram.messenger.g0.h3(new j80(this.f46557b, this.f46558c, this.d, this.f46559e, 1));
                return;
            default:
                org.telegram.messenger.c cVar = this.f46558c;
                int i3 = cVar.f21919a;
                org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
                long j10 = this.d;
                long j11 = -j10;
                boolean z10 = false;
                org.telegram.messenger.r3 g12 = s12.g1(j11, false, null);
                TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(j11));
                org.telegram.messenger.hp.s1(i3).j1(j10);
                org.telegram.ui.Components.voip.n1.l(M0, null, false, Boolean.valueOf((g12 == null || !g12.f25049b.rtmp_stream) ? true : true), this.f46557b.h, this.f46559e, cVar);
                return;
        }
    }
}
