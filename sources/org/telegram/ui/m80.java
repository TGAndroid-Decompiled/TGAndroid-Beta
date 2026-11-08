package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class m80 implements Runnable {
    public final int f47725a;
    public final n80 f47726b;
    public final org.telegram.messenger.c f47727c;
    public final long d;
    public final org.telegram.ui.ActionBar.f2 f47728e;

    public m80(n80 n80Var, org.telegram.messenger.c cVar, long j3, org.telegram.ui.ActionBar.f2 f2Var, int i7) {
        this.f47725a = i7;
        this.f47726b = n80Var;
        this.f47727c = cVar;
        this.d = j3;
        this.f47728e = f2Var;
    }

    @Override
    public final void run() {
        switch (this.f47725a) {
            case 0:
                org.telegram.messenger.g0.h3(new m80(this.f47726b, this.f47727c, this.d, this.f47728e, 1));
                return;
            default:
                org.telegram.messenger.c cVar = this.f47727c;
                int i7 = cVar.f21765a;
                org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
                long j3 = this.d;
                long j10 = -j3;
                boolean z9 = false;
                org.telegram.messenger.r3 g12 = s12.g1(j10, false, null);
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(j10));
                org.telegram.messenger.qp.s1(i7).j1(j3);
                org.telegram.ui.Components.voip.y1.l(M0, null, false, Boolean.valueOf((g12 == null || !g12.f25222b.rtmp_stream) ? true : true), this.f47726b.h, this.f47728e, cVar);
                return;
        }
    }
}
