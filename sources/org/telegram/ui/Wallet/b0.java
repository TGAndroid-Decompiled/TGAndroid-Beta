package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
public final class b0 implements Runnable {
    public volatile boolean f42114a;
    public Runnable f42115b;
    public final String f42116c;
    public final long d;
    public final String f42117e;
    public final byte[] f42118f;
    public final v10 h;
    public final n0 f42119n;

    public b0(n0 n0Var, String str, long j3, String str2, byte[] bArr, v10 v10Var) {
        this.f42119n = n0Var;
        this.f42116c = str;
        this.d = j3;
        this.f42117e = str2;
        this.f42118f = bArr;
        this.h = v10Var;
    }

    @Override
    public final synchronized void run() {
        if (this.f42114a) {
            return;
        }
        this.f42115b = this.f42119n.f42794b.emulateSend(this.f42116c, this.d, this.f42117e, this.f42118f, new bi.p5(27, this, this.h));
    }
}
