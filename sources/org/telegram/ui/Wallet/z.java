package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
public final class z implements Runnable {
    public volatile boolean f43397a;
    public Runnable f43398b;
    public final String f43399c;
    public final long d;
    public final String f43400e;
    public final byte[] f43401f;
    public final v10 h;
    public final l0 f43402n;

    public z(l0 l0Var, String str, long j3, String str2, byte[] bArr, v10 v10Var) {
        this.f43402n = l0Var;
        this.f43399c = str;
        this.d = j3;
        this.f43400e = str2;
        this.f43401f = bArr;
        this.h = v10Var;
    }

    @Override
    public final synchronized void run() {
        if (this.f43397a) {
            return;
        }
        this.f43398b = this.f43402n.f42681b.emulateSend(this.f43399c, this.d, this.f43400e, this.f43401f, new bi.p5(27, this, this.h));
    }
}
