package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class yq implements Runnable {
    public final int E;
    public final boolean F;
    public final int G;
    public final long H;
    public final int I;
    public final boolean J;
    public final int K;
    public final boolean L;
    public final boolean M;
    public final uz N;
    public final ur f28155a;
    public final TLRPC.TL_messages_messages f28156b;
    public final int f28157c;
    public final long d;
    public final long f28158e;
    public final int f28159f;
    public final int h;
    public final int f28160n;
    public final int f28161r;
    public final int f28162s;
    public final int f28163w;
    public final int f28164x;
    public final int f28165y;

    public yq(ur urVar, TLRPC.TL_messages_messages tL_messages_messages, int i7, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z10, int i19, long j11, int i20, boolean z11, int i21, boolean z12, boolean z13, uz uzVar) {
        this.f28155a = urVar;
        this.f28156b = tL_messages_messages;
        this.f28157c = i7;
        this.d = j3;
        this.f28158e = j10;
        this.f28159f = i10;
        this.h = i11;
        this.f28160n = i12;
        this.f28161r = i13;
        this.f28162s = i14;
        this.f28163w = i15;
        this.f28164x = i16;
        this.f28165y = i17;
        this.E = i18;
        this.F = z10;
        this.G = i19;
        this.H = j11;
        this.I = i20;
        this.J = z11;
        this.K = i21;
        this.L = z12;
        this.M = z13;
        this.N = uzVar;
    }

    @Override
    public final void run() {
        this.f28155a.getMessagesController().R3(this.f28156b, this.f28157c, this.d, this.f28158e, this.f28159f, this.h, this.f28160n, true, this.f28161r, this.f28162s, this.f28163w, this.f28164x, this.f28165y, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N);
    }
}
