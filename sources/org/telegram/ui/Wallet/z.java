package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
public final class z implements Runnable {
    public volatile boolean f43404a;
    public Runnable f43405b;
    public final String f43406c;
    public final long d;
    public final String f43407e;
    public final byte[] f43408f;
    public final v10 h;
    public final l0 f43409n;

    public z(l0 l0Var, String str, long j3, String str2, byte[] bArr, v10 v10Var) {
        this.f43409n = l0Var;
        this.f43406c = str;
        this.d = j3;
        this.f43407e = str2;
        this.f43408f = bArr;
        this.h = v10Var;
    }

    @Override
    public final synchronized void run() {
        if (this.f43404a) {
            return;
        }
        this.f43405b = this.f43409n.f42750b.emulateSend(this.f43406c, this.d, this.f43407e, this.f43408f, new bi.p5(27, this, this.h));
    }
}
