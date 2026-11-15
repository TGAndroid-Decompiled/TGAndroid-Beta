package org.telegram.ui.Wallet;

import org.telegram.messenger.s10;
public final class z implements Runnable {
    public volatile boolean f44768a;
    public Runnable f44769b;
    public final String f44770c;
    public final long d;
    public final String f44771e;
    public final byte[] f44772f;
    public final s10 h;
    public final l0 f44773n;

    public z(l0 l0Var, String str, long j3, String str2, byte[] bArr, s10 s10Var) {
        this.f44773n = l0Var;
        this.f44770c = str;
        this.d = j3;
        this.f44771e = str2;
        this.f44772f = bArr;
        this.h = s10Var;
    }

    @Override
    public final synchronized void run() {
        if (this.f44768a) {
            return;
        }
        this.f44769b = this.f44773n.f44079b.emulateSend(this.f44770c, this.d, this.f44771e, this.f44772f, new bi.e4(28, this, this.h));
    }
}
