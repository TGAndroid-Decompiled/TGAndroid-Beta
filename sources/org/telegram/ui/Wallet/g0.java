package org.telegram.ui.Wallet;

import org.telegram.messenger.q10;
public final class g0 implements Runnable {
    public volatile boolean f44278a;
    public Runnable f44279b;
    public final String f44280c;
    public final long d;
    public final String f44281e;
    public final byte[] f44282f;
    public final q10 h;
    public final u0 f44283n;

    public g0(u0 u0Var, String str, long j3, String str2, byte[] bArr, q10 q10Var) {
        this.f44283n = u0Var;
        this.f44280c = str;
        this.d = j3;
        this.f44281e = str2;
        this.f44282f = bArr;
        this.h = q10Var;
    }

    @Override
    public final synchronized void run() {
        if (this.f44278a) {
            return;
        }
        this.f44279b = this.f44283n.f45124b.emulateSend(this.f44280c, this.d, this.f44281e, this.f44282f, new e0(1, this, this.h));
    }
}
