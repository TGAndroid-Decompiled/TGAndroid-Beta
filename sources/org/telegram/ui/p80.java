package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class p80 implements Runnable {
    public final int f48710a;
    public final q80 f48711b;
    public final org.telegram.messenger.c f48712c;
    public final long d;
    public final org.telegram.ui.ActionBar.f2 f48713e;

    public p80(q80 q80Var, org.telegram.messenger.c cVar, long j3, org.telegram.ui.ActionBar.f2 f2Var, int i7) {
        this.f48710a = i7;
        this.f48711b = q80Var;
        this.f48712c = cVar;
        this.d = j3;
        this.f48713e = f2Var;
    }

    @Override
    public final void run() {
        switch (this.f48710a) {
            case 0:
                org.telegram.messenger.g0.h3(new p80(this.f48711b, this.f48712c, this.d, this.f48713e, 1));
                return;
            default:
                org.telegram.messenger.c cVar = this.f48712c;
                int i7 = cVar.f21770a;
                org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
                long j3 = this.d;
                long j10 = -j3;
                boolean z9 = false;
                org.telegram.messenger.r3 g12 = s12.g1(j10, false, null);
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(j10));
                org.telegram.messenger.qp.s1(i7).j1(j3);
                org.telegram.ui.Components.voip.y1.l(M0, null, false, Boolean.valueOf((g12 == null || !g12.f25226b.rtmp_stream) ? true : true), this.f48711b.h, this.f48713e, cVar);
                return;
        }
    }
}
