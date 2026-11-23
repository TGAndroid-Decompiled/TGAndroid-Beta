package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class p80 implements Runnable {
    public final int f50778a;
    public final q80 f50779b;
    public final org.telegram.messenger.c f50780c;
    public final long d;
    public final org.telegram.ui.ActionBar.g2 f50781e;

    public p80(q80 q80Var, org.telegram.messenger.c cVar, long j3, org.telegram.ui.ActionBar.g2 g2Var, int i7) {
        this.f50778a = i7;
        this.f50779b = q80Var;
        this.f50780c = cVar;
        this.d = j3;
        this.f50781e = g2Var;
    }

    @Override
    public final void run() {
        switch (this.f50778a) {
            case 0:
                org.telegram.messenger.g0.g3(new p80(this.f50779b, this.f50780c, this.d, this.f50781e, 1));
                return;
            default:
                org.telegram.messenger.c cVar = this.f50780c;
                int i7 = cVar.f23166a;
                org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i7);
                long j3 = this.d;
                long j10 = -j3;
                boolean z10 = false;
                org.telegram.messenger.t3 i12 = u12.i1(j10, false, null);
                TLRPC.Chat O0 = org.telegram.messenger.np.u1(i7).O0(Long.valueOf(j10));
                org.telegram.messenger.np.u1(i7).l1(j3);
                org.telegram.ui.Components.voip.b2.l(O0, null, false, Boolean.valueOf((i12 == null || !i12.f26914b.rtmp_stream) ? true : true), this.f50779b.h, this.f50781e, cVar);
                return;
        }
    }
}
