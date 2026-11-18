package org.telegram.ui.Wallet;

import org.telegram.messenger.q10;
public final class g0 implements Runnable {
    public volatile boolean f44238a;
    public Runnable f44239b;
    public final String f44240c;
    public final long d;
    public final String f44241e;
    public final byte[] f44242f;
    public final q10 h;
    public final u0 f44243n;

    public g0(u0 u0Var, String str, long j3, String str2, byte[] bArr, q10 q10Var) {
        this.f44243n = u0Var;
        this.f44240c = str;
        this.d = j3;
        this.f44241e = str2;
        this.f44242f = bArr;
        this.h = q10Var;
    }

    @Override
    public final synchronized void run() {
        if (this.f44238a) {
            return;
        }
        this.f44239b = this.f44243n.f45084b.emulateSend(this.f44240c, this.d, this.f44241e, this.f44242f, new e0(1, this, this.h));
    }
}
