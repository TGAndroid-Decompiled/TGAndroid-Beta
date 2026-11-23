package org.telegram.ui.Wallet;

import org.telegram.messenger.r10;
public final class g0 implements Runnable {
    public volatile boolean f44282a;
    public Runnable f44283b;
    public final String f44284c;
    public final long d;
    public final String f44285e;
    public final byte[] f44286f;
    public final r10 h;
    public final u0 f44287n;

    public g0(u0 u0Var, String str, long j3, String str2, byte[] bArr, r10 r10Var) {
        this.f44287n = u0Var;
        this.f44284c = str;
        this.d = j3;
        this.f44285e = str2;
        this.f44286f = bArr;
        this.h = r10Var;
    }

    @Override
    public final synchronized void run() {
        if (this.f44282a) {
            return;
        }
        this.f44283b = this.f44287n.f45128b.emulateSend(this.f44284c, this.d, this.f44285e, this.f44286f, new e0(1, this, this.h));
    }
}
