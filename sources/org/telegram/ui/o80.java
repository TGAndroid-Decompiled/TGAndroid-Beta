package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class o80 implements Runnable {
    public final int f48395a;
    public final p80 f48396b;
    public final org.telegram.messenger.c f48397c;
    public final long d;
    public final org.telegram.ui.ActionBar.f2 f48398e;

    public o80(p80 p80Var, org.telegram.messenger.c cVar, long j3, org.telegram.ui.ActionBar.f2 f2Var, int i7) {
        this.f48395a = i7;
        this.f48396b = p80Var;
        this.f48397c = cVar;
        this.d = j3;
        this.f48398e = f2Var;
    }

    @Override
    public final void run() {
        switch (this.f48395a) {
            case 0:
                org.telegram.messenger.g0.h3(new o80(this.f48396b, this.f48397c, this.d, this.f48398e, 1));
                return;
            default:
                org.telegram.messenger.c cVar = this.f48397c;
                int i7 = cVar.f21765a;
                org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
                long j3 = this.d;
                long j10 = -j3;
                boolean z9 = false;
                org.telegram.messenger.r3 g12 = s12.g1(j10, false, null);
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(j10));
                org.telegram.messenger.qp.s1(i7).j1(j3);
                org.telegram.ui.Components.voip.y1.l(M0, null, false, Boolean.valueOf((g12 == null || !g12.f25222b.rtmp_stream) ? true : true), this.f48396b.h, this.f48398e, cVar);
                return;
        }
    }
}
