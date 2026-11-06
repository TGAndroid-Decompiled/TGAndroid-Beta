package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
public final class b0 implements Runnable {
    public volatile boolean f42089a;
    public Runnable f42090b;
    public final String f42091c;
    public final long d;
    public final String f42092e;
    public final byte[] f42093f;
    public final v10 h;
    public final n0 f42094n;

    public b0(n0 n0Var, String str, long j3, String str2, byte[] bArr, v10 v10Var) {
        this.f42094n = n0Var;
        this.f42091c = str;
        this.d = j3;
        this.f42092e = str2;
        this.f42093f = bArr;
        this.h = v10Var;
    }

    @Override
    public final synchronized void run() {
        if (this.f42089a) {
            return;
        }
        this.f42090b = this.f42094n.f42769b.emulateSend(this.f42091c, this.d, this.f42092e, this.f42093f, new bi.p5(27, this, this.h));
    }
}
