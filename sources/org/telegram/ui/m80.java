package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class m80 implements Runnable {
    public final int f47695a;
    public final n80 f47696b;
    public final org.telegram.messenger.c f47697c;
    public final long d;
    public final org.telegram.ui.ActionBar.f2 f47698e;

    public m80(n80 n80Var, org.telegram.messenger.c cVar, long j3, org.telegram.ui.ActionBar.f2 f2Var, int i7) {
        this.f47695a = i7;
        this.f47696b = n80Var;
        this.f47697c = cVar;
        this.d = j3;
        this.f47698e = f2Var;
    }

    @Override
    public final void run() {
        switch (this.f47695a) {
            case 0:
                org.telegram.messenger.g0.h3(new m80(this.f47696b, this.f47697c, this.d, this.f47698e, 1));
                return;
            default:
                org.telegram.messenger.c cVar = this.f47697c;
                int i7 = cVar.f21723a;
                org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
                long j3 = this.d;
                long j10 = -j3;
                boolean z9 = false;
                org.telegram.messenger.r3 g12 = s12.g1(j10, false, null);
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(j10));
                org.telegram.messenger.qp.s1(i7).j1(j3);
                org.telegram.ui.Components.voip.y1.l(M0, null, false, Boolean.valueOf((g12 == null || !g12.f25201b.rtmp_stream) ? true : true), this.f47696b.h, this.f47698e, cVar);
                return;
        }
    }
}
