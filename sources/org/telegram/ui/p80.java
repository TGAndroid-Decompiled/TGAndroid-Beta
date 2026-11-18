package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class p80 implements Runnable {
    public final int f50760a;
    public final q80 f50761b;
    public final org.telegram.messenger.c f50762c;
    public final long d;
    public final org.telegram.ui.ActionBar.h2 f50763e;

    public p80(q80 q80Var, org.telegram.messenger.c cVar, long j3, org.telegram.ui.ActionBar.h2 h2Var, int i7) {
        this.f50760a = i7;
        this.f50761b = q80Var;
        this.f50762c = cVar;
        this.d = j3;
        this.f50763e = h2Var;
    }

    @Override
    public final void run() {
        switch (this.f50760a) {
            case 0:
                org.telegram.messenger.g0.g3(new p80(this.f50761b, this.f50762c, this.d, this.f50763e, 1));
                return;
            default:
                org.telegram.messenger.c cVar = this.f50762c;
                int i7 = cVar.f23218a;
                org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
                long j3 = this.d;
                long j10 = -j3;
                boolean z10 = false;
                org.telegram.messenger.t3 i12 = u12.i1(j10, false, null);
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(j10));
                org.telegram.messenger.mp.u1(i7).l1(j3);
                org.telegram.ui.Components.voip.b2.l(O0, null, false, Boolean.valueOf((i12 == null || !i12.f26935b.rtmp_stream) ? true : true), this.f50761b.h, this.f50763e, cVar);
                return;
        }
    }
}
