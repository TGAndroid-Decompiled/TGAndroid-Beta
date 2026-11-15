package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class m80 implements Runnable {
    public final int f49180a;
    public final n80 f49181b;
    public final org.telegram.messenger.c f49182c;
    public final long d;
    public final org.telegram.ui.ActionBar.e2 f49183e;

    public m80(n80 n80Var, org.telegram.messenger.c cVar, long j3, org.telegram.ui.ActionBar.e2 e2Var, int i7) {
        this.f49180a = i7;
        this.f49181b = n80Var;
        this.f49182c = cVar;
        this.d = j3;
        this.f49183e = e2Var;
    }

    @Override
    public final void run() {
        switch (this.f49180a) {
            case 0:
                org.telegram.messenger.g0.h3(new m80(this.f49181b, this.f49182c, this.d, this.f49183e, 1));
                return;
            default:
                org.telegram.messenger.c cVar = this.f49182c;
                int i7 = cVar.f22778a;
                org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
                long j3 = this.d;
                long j10 = -j3;
                boolean z10 = false;
                org.telegram.messenger.r3 g12 = s12.g1(j10, false, null);
                TLRPC.Chat M0 = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(j10));
                org.telegram.messenger.np.s1(i7).j1(j3);
                org.telegram.ui.Components.voip.c2.l(M0, null, false, Boolean.valueOf((g12 == null || !g12.f26208b.rtmp_stream) ? true : true), this.f49181b.h, this.f49183e, cVar);
                return;
        }
    }
}
