package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ym implements nr {
    public final mp f28161a;
    public final long f28162b;
    public final int f28163c;
    public final boolean d;
    public final TLRPC.InputPeer f28164e;
    public final long f28165f;

    public ym(mp mpVar, long j3, int i7, boolean z10, TLRPC.InputPeer inputPeer, long j10) {
        this.f28161a = mpVar;
        this.f28162b = j3;
        this.f28163c = i7;
        this.d = z10;
        this.f28164e = inputPeer;
        this.f28165f = j10;
    }

    @Override
    public final void a(int i7) {
        mp mpVar = this.f28161a;
        long e10 = mpVar.getUserConfig().e();
        long j3 = this.f28162b;
        if (j3 == e10) {
            mpVar.I1().b();
        }
        mpVar.Y(j3, 2, this.f28163c, Math.max(0, i7), this.d, this.f28164e, this.f28165f);
        mpVar.J(1);
    }
}
