package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class m80 implements Runnable {
    public final int f47722a;
    public final n80 f47723b;
    public final org.telegram.messenger.c f47724c;
    public final long d;
    public final org.telegram.ui.ActionBar.f2 f47725e;

    public m80(n80 n80Var, org.telegram.messenger.c cVar, long j3, org.telegram.ui.ActionBar.f2 f2Var, int i7) {
        this.f47722a = i7;
        this.f47723b = n80Var;
        this.f47724c = cVar;
        this.d = j3;
        this.f47725e = f2Var;
    }

    @Override
    public final void run() {
        switch (this.f47722a) {
            case 0:
                org.telegram.messenger.g0.h3(new m80(this.f47723b, this.f47724c, this.d, this.f47725e, 1));
                return;
            default:
                org.telegram.messenger.c cVar = this.f47724c;
                int i7 = cVar.f21723a;
                org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
                long j3 = this.d;
                long j10 = -j3;
                boolean z9 = false;
                org.telegram.messenger.r3 g12 = s12.g1(j10, false, null);
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(j10));
                org.telegram.messenger.qp.s1(i7).j1(j3);
                org.telegram.ui.Components.voip.y1.l(M0, null, false, Boolean.valueOf((g12 == null || !g12.f25201b.rtmp_stream) ? true : true), this.f47723b.h, this.f47725e, cVar);
                return;
        }
    }
}
