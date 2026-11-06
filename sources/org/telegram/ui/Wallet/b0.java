package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
public final class b0 implements Runnable {
    public volatile boolean f42113a;
    public Runnable f42114b;
    public final String f42115c;
    public final long d;
    public final String f42116e;
    public final byte[] f42117f;
    public final v10 h;
    public final n0 f42118n;

    public b0(n0 n0Var, String str, long j3, String str2, byte[] bArr, v10 v10Var) {
        this.f42118n = n0Var;
        this.f42115c = str;
        this.d = j3;
        this.f42116e = str2;
        this.f42117f = bArr;
        this.h = v10Var;
    }

    @Override
    public final synchronized void run() {
        if (this.f42113a) {
            return;
        }
        this.f42114b = this.f42118n.f42793b.emulateSend(this.f42115c, this.d, this.f42116e, this.f42117f, new bi.p5(27, this, this.h));
    }
}
