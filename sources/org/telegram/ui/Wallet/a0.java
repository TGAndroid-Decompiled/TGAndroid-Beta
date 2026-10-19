package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class a0 implements Runnable {
    public volatile boolean f33957a;
    public Runnable f33958b;
    public final String f33959c;
    public final long d;
    public final String e;
    public final byte[] f33960f;
    public final Utilities.Callback2 h;
    public final m0 f33961n;

    public a0(m0 m0Var, String str, long j10, String str2, byte[] bArr, Utilities.Callback2 callback2) {
        this.f33961n = m0Var;
        this.f33959c = str;
        this.d = j10;
        this.e = str2;
        this.f33960f = bArr;
        this.h = callback2;
    }

    @Override
    public final synchronized void run() {
        if (this.f33957a) {
            return;
        }
        this.f33958b = this.f33961n.f34469b.emulateSend(this.f33959c, this.d, this.e, this.f33960f, new ai.q5(28, this, this.h));
    }
}
