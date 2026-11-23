package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class zm implements or {
    public final np f28355a;
    public final long f28356b;
    public final int f28357c;
    public final boolean d;
    public final TLRPC.InputPeer f28358e;
    public final long f28359f;

    public zm(np npVar, long j3, int i7, boolean z10, TLRPC.InputPeer inputPeer, long j10) {
        this.f28355a = npVar;
        this.f28356b = j3;
        this.f28357c = i7;
        this.d = z10;
        this.f28358e = inputPeer;
        this.f28359f = j10;
    }

    @Override
    public final void a(int i7) {
        np npVar = this.f28355a;
        long e10 = npVar.getUserConfig().e();
        long j3 = this.f28356b;
        if (j3 == e10) {
            npVar.I1().b();
        }
        npVar.Y(j3, 2, this.f28357c, Math.max(0, i7), this.d, this.f28358e, this.f28359f);
        npVar.J(1);
    }
}
