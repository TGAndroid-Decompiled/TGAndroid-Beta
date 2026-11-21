package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ym implements nr {
    public final mp f28187a;
    public final long f28188b;
    public final int f28189c;
    public final boolean d;
    public final TLRPC.InputPeer f28190e;
    public final long f28191f;

    public ym(mp mpVar, long j3, int i7, boolean z10, TLRPC.InputPeer inputPeer, long j10) {
        this.f28187a = mpVar;
        this.f28188b = j3;
        this.f28189c = i7;
        this.d = z10;
        this.f28190e = inputPeer;
        this.f28191f = j10;
    }

    @Override
    public final void a(int i7) {
        mp mpVar = this.f28187a;
        long e10 = mpVar.getUserConfig().e();
        long j3 = this.f28188b;
        if (j3 == e10) {
            mpVar.I1().b();
        }
        mpVar.Y(j3, 2, this.f28189c, Math.max(0, i7), this.d, this.f28190e, this.f28191f);
        mpVar.J(1);
    }
}
