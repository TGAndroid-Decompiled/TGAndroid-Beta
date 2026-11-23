package org.telegram.ui.Wallet;

import org.telegram.messenger.p10;
public final class h0 implements Runnable {
    public volatile boolean f44410a;
    public Runnable f44411b;
    public final String f44412c;
    public final long d;
    public final String f44413e;
    public final byte[] f44414f;
    public final p10 h;
    public final v0 f44415n;

    public h0(v0 v0Var, String str, long j3, String str2, byte[] bArr, p10 p10Var) {
        this.f44415n = v0Var;
        this.f44412c = str;
        this.d = j3;
        this.f44413e = str2;
        this.f44414f = bArr;
        this.h = p10Var;
    }

    @Override
    public final synchronized void run() {
        if (this.f44410a) {
            return;
        }
        this.f44411b = this.f44415n.f45256b.emulateSend(this.f44412c, this.d, this.f44413e, this.f44414f, new f0(1, this, this.h));
    }
}
