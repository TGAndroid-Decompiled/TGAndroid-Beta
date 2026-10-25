package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class z implements Runnable {
    public volatile boolean f37529a;
    public Runnable f37530b;
    public final String f37531c;
    public final long d;
    public final String e;
    public final byte[] f37532f;
    public final Utilities.Callback2 h;
    public final l0 f37533n;

    public z(l0 l0Var, String str, long j10, String str2, byte[] bArr, Utilities.Callback2 callback2) {
        this.f37533n = l0Var;
        this.f37531c = str;
        this.d = j10;
        this.e = str2;
        this.f37532f = bArr;
        this.h = callback2;
    }

    @Override
    public final synchronized void run() {
        if (this.f37529a) {
            return;
        }
        this.f37530b = this.f37533n.f36805b.emulateSend(this.f37531c, this.d, this.e, this.f37532f, new bi.m5(28, this, this.h));
    }
}
