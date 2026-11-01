package org.telegram.ui.Wallet;

import org.telegram.messenger.k20;
public final class y implements Runnable {
    public volatile boolean f35402a;
    public Runnable f35403b;
    public final String f35404c;
    public final long d;
    public final String e;
    public final byte[] f35405f;
    public final k20 h;
    public final k0 f35406n;

    public y(k0 k0Var, String str, long j10, String str2, byte[] bArr, k20 k20Var) {
        this.f35406n = k0Var;
        this.f35404c = str;
        this.d = j10;
        this.e = str2;
        this.f35405f = bArr;
        this.h = k20Var;
    }

    @Override
    public final synchronized void run() {
        if (this.f35402a) {
            return;
        }
        this.f35403b = this.f35406n.f34782b.emulateSend(this.f35404c, this.d, this.e, this.f35405f, new ih.s(21, this, this.h));
    }
}
