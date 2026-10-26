package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class z implements Runnable {
    public volatile boolean f37532a;
    public Runnable f37533b;
    public final String f37534c;
    public final long d;
    public final String e;
    public final byte[] f37535f;
    public final Utilities.Callback2 h;
    public final l0 f37536n;

    public z(l0 l0Var, String str, long j10, String str2, byte[] bArr, Utilities.Callback2 callback2) {
        this.f37536n = l0Var;
        this.f37534c = str;
        this.d = j10;
        this.e = str2;
        this.f37535f = bArr;
        this.h = callback2;
    }

    @Override
    public final synchronized void run() {
        if (this.f37532a) {
            return;
        }
        this.f37533b = this.f37536n.f36808b.emulateSend(this.f37534c, this.d, this.e, this.f37535f, new bi.m5(28, this, this.h));
    }
}
