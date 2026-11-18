package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ym implements nr {
    public final mp f28159a;
    public final long f28160b;
    public final int f28161c;
    public final boolean d;
    public final TLRPC.InputPeer f28162e;
    public final long f28163f;

    public ym(mp mpVar, long j3, int i7, boolean z10, TLRPC.InputPeer inputPeer, long j10) {
        this.f28159a = mpVar;
        this.f28160b = j3;
        this.f28161c = i7;
        this.d = z10;
        this.f28162e = inputPeer;
        this.f28163f = j10;
    }

    @Override
    public final void a(int i7) {
        mp mpVar = this.f28159a;
        long e10 = mpVar.getUserConfig().e();
        long j3 = this.f28160b;
        if (j3 == e10) {
            mpVar.I1().b();
        }
        mpVar.Y(j3, 2, this.f28161c, Math.max(0, i7), this.d, this.f28162e, this.f28163f);
        mpVar.J(1);
    }
}
