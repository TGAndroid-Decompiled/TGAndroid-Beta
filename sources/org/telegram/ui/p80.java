package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class p80 implements Runnable {
    public final int f50805a;
    public final q80 f50806b;
    public final org.telegram.messenger.c f50807c;
    public final long d;
    public final org.telegram.ui.ActionBar.g2 f50808e;

    public p80(q80 q80Var, org.telegram.messenger.c cVar, long j3, org.telegram.ui.ActionBar.g2 g2Var, int i7) {
        this.f50805a = i7;
        this.f50806b = q80Var;
        this.f50807c = cVar;
        this.d = j3;
        this.f50808e = g2Var;
    }

    @Override
    public final void run() {
        switch (this.f50805a) {
            case 0:
                org.telegram.messenger.g0.g3(new p80(this.f50806b, this.f50807c, this.d, this.f50808e, 1));
                return;
            default:
                org.telegram.messenger.c cVar = this.f50807c;
                int i7 = cVar.f23202a;
                org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i7);
                long j3 = this.d;
                long j10 = -j3;
                boolean z10 = false;
                org.telegram.messenger.t3 i12 = u12.i1(j10, false, null);
                TLRPC.Chat O0 = org.telegram.messenger.np.u1(i7).O0(Long.valueOf(j10));
                org.telegram.messenger.np.u1(i7).l1(j3);
                org.telegram.ui.Components.voip.b2.l(O0, null, false, Boolean.valueOf((i12 == null || !i12.f26950b.rtmp_stream) ? true : true), this.f50806b.h, this.f50808e, cVar);
                return;
        }
    }
}
