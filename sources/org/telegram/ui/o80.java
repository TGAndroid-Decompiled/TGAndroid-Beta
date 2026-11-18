package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class o80 implements Runnable {
    public final int f50529a;
    public final p80 f50530b;
    public final org.telegram.messenger.c f50531c;
    public final long d;
    public final org.telegram.ui.ActionBar.h2 f50532e;

    public o80(p80 p80Var, org.telegram.messenger.c cVar, long j3, org.telegram.ui.ActionBar.h2 h2Var, int i7) {
        this.f50529a = i7;
        this.f50530b = p80Var;
        this.f50531c = cVar;
        this.d = j3;
        this.f50532e = h2Var;
    }

    @Override
    public final void run() {
        switch (this.f50529a) {
            case 0:
                org.telegram.messenger.g0.g3(new o80(this.f50530b, this.f50531c, this.d, this.f50532e, 1));
                return;
            default:
                org.telegram.messenger.c cVar = this.f50531c;
                int i7 = cVar.f23221a;
                org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
                long j3 = this.d;
                long j10 = -j3;
                boolean z10 = false;
                org.telegram.messenger.t3 i12 = u12.i1(j10, false, null);
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(j10));
                org.telegram.messenger.mp.u1(i7).l1(j3);
                org.telegram.ui.Components.voip.b2.l(O0, null, false, Boolean.valueOf((i12 == null || !i12.f26937b.rtmp_stream) ? true : true), this.f50530b.h, this.f50532e, cVar);
                return;
        }
    }
}
