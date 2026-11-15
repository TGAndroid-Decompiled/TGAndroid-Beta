package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class zq implements Runnable {
    public final int E;
    public final boolean F;
    public final int G;
    public final long H;
    public final int I;
    public final boolean J;
    public final int K;
    public final boolean L;
    public final boolean M;
    public final xz N;
    public final vr f27988a;
    public final TLRPC.TL_messages_messages f27989b;
    public final int f27990c;
    public final long d;
    public final long f27991e;
    public final int f27992f;
    public final int h;
    public final int f27993n;
    public final int f27994r;
    public final int f27995s;
    public final int f27996w;
    public final int f27997x;
    public final int f27998y;

    public zq(vr vrVar, TLRPC.TL_messages_messages tL_messages_messages, int i7, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z10, int i19, long j11, int i20, boolean z11, int i21, boolean z12, boolean z13, xz xzVar) {
        this.f27988a = vrVar;
        this.f27989b = tL_messages_messages;
        this.f27990c = i7;
        this.d = j3;
        this.f27991e = j10;
        this.f27992f = i10;
        this.h = i11;
        this.f27993n = i12;
        this.f27994r = i13;
        this.f27995s = i14;
        this.f27996w = i15;
        this.f27997x = i16;
        this.f27998y = i17;
        this.E = i18;
        this.F = z10;
        this.G = i19;
        this.H = j11;
        this.I = i20;
        this.J = z11;
        this.K = i21;
        this.L = z12;
        this.M = z13;
        this.N = xzVar;
    }

    @Override
    public final void run() {
        this.f27988a.getMessagesController().K3(this.f27989b, this.f27990c, this.d, this.f27991e, this.f27992f, this.h, this.f27993n, true, this.f27994r, this.f27995s, this.f27996w, this.f27997x, this.f27998y, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N);
    }
}
