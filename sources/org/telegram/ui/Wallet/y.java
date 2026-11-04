package org.telegram.ui.Wallet;

import org.telegram.messenger.n10;
public final class y implements Runnable {
    public volatile boolean f43448a;
    public Runnable f43449b;
    public final String f43450c;
    public final long d;
    public final String f43451e;
    public final byte[] f43452f;
    public final n10 h;
    public final k0 f43453n;

    public y(k0 k0Var, String str, long j10, String str2, byte[] bArr, n10 n10Var) {
        this.f43453n = k0Var;
        this.f43450c = str;
        this.d = j10;
        this.f43451e = str2;
        this.f43452f = bArr;
        this.h = n10Var;
    }

    @Override
    public final synchronized void run() {
        if (this.f43448a) {
            return;
        }
        this.f43449b = this.f43453n.f42719b.emulateSend(this.f43450c, this.d, this.f43451e, this.f43452f, new ai.q4(28, this, this.h));
    }
}
