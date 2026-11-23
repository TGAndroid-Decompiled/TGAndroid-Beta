package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class o80 implements Runnable {
    public final int f50602a;
    public final p80 f50603b;
    public final org.telegram.messenger.c f50604c;
    public final long d;
    public final org.telegram.ui.ActionBar.g2 f50605e;

    public o80(p80 p80Var, org.telegram.messenger.c cVar, long j3, org.telegram.ui.ActionBar.g2 g2Var, int i7) {
        this.f50602a = i7;
        this.f50603b = p80Var;
        this.f50604c = cVar;
        this.d = j3;
        this.f50605e = g2Var;
    }

    @Override
    public final void run() {
        switch (this.f50602a) {
            case 0:
                org.telegram.messenger.g0.g3(new o80(this.f50603b, this.f50604c, this.d, this.f50605e, 1));
                return;
            default:
                org.telegram.messenger.c cVar = this.f50604c;
                int i7 = cVar.f23343a;
                org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
                long j3 = this.d;
                long j10 = -j3;
                boolean z10 = false;
                org.telegram.messenger.t3 i12 = u12.i1(j10, false, null);
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(j10));
                org.telegram.messenger.mp.u1(i7).l1(j3);
                org.telegram.ui.Components.voip.c2.l(O0, null, false, Boolean.valueOf((i12 == null || !i12.f27034b.rtmp_stream) ? true : true), this.f50603b.h, this.f50605e, cVar);
                return;
        }
    }
}
