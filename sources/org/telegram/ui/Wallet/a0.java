package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
public final class a0 implements Runnable {
    public volatile boolean f42085a;
    public Runnable f42086b;
    public final String f42087c;
    public final long d;
    public final String f42088e;
    public final byte[] f42089f;
    public final v10 h;
    public final m0 f42090n;

    public a0(m0 m0Var, String str, long j3, String str2, byte[] bArr, v10 v10Var) {
        this.f42090n = m0Var;
        this.f42087c = str;
        this.d = j3;
        this.f42088e = str2;
        this.f42089f = bArr;
        this.h = v10Var;
    }

    @Override
    public final synchronized void run() {
        if (this.f42085a) {
            return;
        }
        this.f42086b = this.f42090n.f42763b.emulateSend(this.f42087c, this.d, this.f42088e, this.f42089f, new bi.p5(27, this, this.h));
    }
}
