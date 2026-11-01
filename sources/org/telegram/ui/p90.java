package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class p90 implements Runnable {
    public final int f40427a;
    public final q90 f40428b;
    public final org.telegram.messenger.c f40429c;
    public final long d;
    public final org.telegram.ui.ActionBar.k2 e;

    public p90(q90 q90Var, org.telegram.messenger.c cVar, long j10, org.telegram.ui.ActionBar.k2 k2Var, int i10) {
        this.f40427a = i10;
        this.f40428b = q90Var;
        this.f40429c = cVar;
        this.d = j10;
        this.e = k2Var;
    }

    @Override
    public final void run() {
        switch (this.f40427a) {
            case 0:
                org.telegram.messenger.i0.g3(new p90(this.f40428b, this.f40429c, this.d, this.e, 1));
                return;
            default:
                org.telegram.messenger.c cVar = this.f40429c;
                int i10 = cVar.f15043a;
                org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i10);
                long j10 = this.d;
                long j11 = -j10;
                boolean z10 = false;
                org.telegram.messenger.u3 f12 = r12.f1(j11, false, null);
                TLRPC.Chat L0 = org.telegram.messenger.wp.r1(i10).L0(Long.valueOf(j11));
                org.telegram.messenger.wp.r1(i10).i1(j10);
                org.telegram.ui.Components.voip.n1.l(L0, null, false, Boolean.valueOf((f12 == null || !f12.f18361b.rtmp_stream) ? true : true), this.f40428b.h, this.e, cVar);
                return;
        }
    }
}
