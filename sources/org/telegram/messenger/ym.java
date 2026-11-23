package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ym implements nr {
    public final mp f28259a;
    public final long f28260b;
    public final int f28261c;
    public final boolean d;
    public final TLRPC.InputPeer f28262e;
    public final long f28263f;

    public ym(mp mpVar, long j3, int i7, boolean z10, TLRPC.InputPeer inputPeer, long j10) {
        this.f28259a = mpVar;
        this.f28260b = j3;
        this.f28261c = i7;
        this.d = z10;
        this.f28262e = inputPeer;
        this.f28263f = j10;
    }

    @Override
    public final void a(int i7) {
        mp mpVar = this.f28259a;
        long e10 = mpVar.getUserConfig().e();
        long j3 = this.f28260b;
        if (j3 == e10) {
            mpVar.I1().b();
        }
        mpVar.Y(j3, 2, this.f28261c, Math.max(0, i7), this.d, this.f28262e, this.f28263f);
        mpVar.J(1);
    }
}
