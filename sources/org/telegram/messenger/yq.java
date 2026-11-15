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
    public final xz N;
    public final vr f27805a;
    public final TLRPC.TL_messages_messages f27806b;
    public final int f27807c;
    public final long d;
    public final long f27808e;
    public final int f27809f;
    public final int h;
    public final int f27810n;
    public final int f27811r;
    public final int f27812s;
    public final int f27813w;
    public final int f27814x;
    public final int f27815y;

    public yq(vr vrVar, TLRPC.TL_messages_messages tL_messages_messages, int i7, long j3, long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z10, int i19, long j11, int i20, boolean z11, int i21, boolean z12, boolean z13, xz xzVar) {
        this.f27805a = vrVar;
        this.f27806b = tL_messages_messages;
        this.f27807c = i7;
        this.d = j3;
        this.f27808e = j10;
        this.f27809f = i10;
        this.h = i11;
        this.f27810n = i12;
        this.f27811r = i13;
        this.f27812s = i14;
        this.f27813w = i15;
        this.f27814x = i16;
        this.f27815y = i17;
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
        this.f27805a.getMessagesController().K3(this.f27806b, this.f27807c, this.d, this.f27808e, this.f27809f, this.h, this.f27810n, true, this.f27811r, this.f27812s, this.f27813w, this.f27814x, this.f27815y, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N);
    }
}
