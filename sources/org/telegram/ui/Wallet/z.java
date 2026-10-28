package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class z implements Runnable {
    public volatile boolean f37556a;
    public Runnable f37557b;
    public final String f37558c;
    public final long d;
    public final String e;
    public final byte[] f37559f;
    public final Utilities.Callback2 h;
    public final l0 f37560n;

    public z(l0 l0Var, String str, long j10, String str2, byte[] bArr, Utilities.Callback2 callback2) {
        this.f37560n = l0Var;
        this.f37558c = str;
        this.d = j10;
        this.e = str2;
        this.f37559f = bArr;
        this.h = callback2;
    }

    @Override
    public final synchronized void run() {
        if (this.f37556a) {
            return;
        }
        this.f37557b = this.f37560n.f36835b.emulateSend(this.f37558c, this.d, this.e, this.f37559f, new bi.m5(28, this, this.h));
    }
}
