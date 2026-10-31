package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class q90 implements Runnable {
    public final int f40935a;
    public final r90 f40936b;
    public final org.telegram.messenger.c f40937c;
    public final long d;
    public final org.telegram.ui.ActionBar.k2 e;

    public q90(r90 r90Var, org.telegram.messenger.c cVar, long j10, org.telegram.ui.ActionBar.k2 k2Var, int i10) {
        this.f40935a = i10;
        this.f40936b = r90Var;
        this.f40937c = cVar;
        this.d = j10;
        this.e = k2Var;
    }

    @Override
    public final void run() {
        switch (this.f40935a) {
            case 0:
                org.telegram.messenger.i0.g3(new q90(this.f40936b, this.f40937c, this.d, this.e, 1));
                return;
            default:
                org.telegram.messenger.c cVar = this.f40937c;
                int i10 = cVar.f14863a;
                org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
                long j10 = this.d;
                long j11 = -j10;
                boolean z10 = false;
                org.telegram.messenger.u3 f12 = r12.f1(j11, false, null);
                TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(j11));
                org.telegram.messenger.vp.r1(i10).i1(j10);
                org.telegram.ui.Components.voip.m1.l(L0, null, false, Boolean.valueOf((f12 == null || !f12.f18228b.rtmp_stream) ? true : true), this.f40936b.h, this.e, cVar);
                return;
        }
    }
}
