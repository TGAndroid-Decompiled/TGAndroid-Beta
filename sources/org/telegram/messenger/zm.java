package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class zm implements or {
    public final np f28319a;
    public final long f28320b;
    public final int f28321c;
    public final boolean d;
    public final TLRPC.InputPeer f28322e;
    public final long f28323f;

    public zm(np npVar, long j3, int i7, boolean z10, TLRPC.InputPeer inputPeer, long j10) {
        this.f28319a = npVar;
        this.f28320b = j3;
        this.f28321c = i7;
        this.d = z10;
        this.f28322e = inputPeer;
        this.f28323f = j10;
    }

    @Override
    public final void a(int i7) {
        np npVar = this.f28319a;
        long e10 = npVar.getUserConfig().e();
        long j3 = this.f28320b;
        if (j3 == e10) {
            npVar.I1().b();
        }
        npVar.Y(j3, 2, this.f28321c, Math.max(0, i7), this.d, this.f28322e, this.f28323f);
        npVar.J(1);
    }
}
