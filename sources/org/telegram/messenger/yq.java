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
    public final ur f28119a;
    public final TLRPC.TL_messages_messages f28120b;
    public final int f28121c;
    public final long d;
    public final long f28122e;
    public final int f28123f;
    public final int h;
    public final int f28124n;
    public final int f28125r;
    public final int f28126s;
    public final int f28127w;
    public final int f28128x;
    public final int f28129y;

    public yq(ur urVar, TLRPC.TL_messages_messages tL_messages_messages, int i7, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z10, int i19, long j11, int i20, boolean z11, int i21, boolean z12, boolean z13, uz uzVar) {
        this.f28119a = urVar;
        this.f28120b = tL_messages_messages;
        this.f28121c = i7;
        this.d = j3;
        this.f28122e = j10;
        this.f28123f = i10;
        this.h = i11;
        this.f28124n = i12;
        this.f28125r = i13;
        this.f28126s = i14;
        this.f28127w = i15;
        this.f28128x = i16;
        this.f28129y = i17;
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
        this.f28119a.getMessagesController().R3(this.f28120b, this.f28121c, this.d, this.f28122e, this.f28123f, this.h, this.f28124n, true, this.f28125r, this.f28126s, this.f28127w, this.f28128x, this.f28129y, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N);
    }
}
