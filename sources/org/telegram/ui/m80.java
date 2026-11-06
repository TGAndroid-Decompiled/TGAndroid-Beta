package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class m80 implements Runnable {
    public final int f47721a;
    public final n80 f47722b;
    public final org.telegram.messenger.c f47723c;
    public final long d;
    public final org.telegram.ui.ActionBar.f2 f47724e;

    public m80(n80 n80Var, org.telegram.messenger.c cVar, long j3, org.telegram.ui.ActionBar.f2 f2Var, int i7) {
        this.f47721a = i7;
        this.f47722b = n80Var;
        this.f47723c = cVar;
        this.d = j3;
        this.f47724e = f2Var;
    }

    @Override
    public final void run() {
        switch (this.f47721a) {
            case 0:
                org.telegram.messenger.g0.h3(new m80(this.f47722b, this.f47723c, this.d, this.f47724e, 1));
                return;
            default:
                org.telegram.messenger.c cVar = this.f47723c;
                int i7 = cVar.f21729a;
                org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
                long j3 = this.d;
                long j10 = -j3;
                boolean z9 = false;
                org.telegram.messenger.r3 g12 = s12.g1(j10, false, null);
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(j10));
                org.telegram.messenger.qp.s1(i7).j1(j3);
                org.telegram.ui.Components.voip.y1.l(M0, null, false, Boolean.valueOf((g12 == null || !g12.f25209b.rtmp_stream) ? true : true), this.f47722b.h, this.f47724e, cVar);
                return;
        }
    }
}
