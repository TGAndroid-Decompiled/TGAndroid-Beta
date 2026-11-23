package org.telegram.ui.Wallet;

import org.telegram.messenger.r10;
public final class g0 implements Runnable {
    public volatile boolean f44248a;
    public Runnable f44249b;
    public final String f44250c;
    public final long d;
    public final String f44251e;
    public final byte[] f44252f;
    public final r10 h;
    public final u0 f44253n;

    public g0(u0 u0Var, String str, long j3, String str2, byte[] bArr, r10 r10Var) {
        this.f44253n = u0Var;
        this.f44250c = str;
        this.d = j3;
        this.f44251e = str2;
        this.f44252f = bArr;
        this.h = r10Var;
    }

    @Override
    public final synchronized void run() {
        if (this.f44248a) {
            return;
        }
        this.f44249b = this.f44253n.f45094b.emulateSend(this.f44250c, this.d, this.f44251e, this.f44252f, new e0(1, this, this.h));
    }
}
