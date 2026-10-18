package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class a0 implements Runnable {
    public volatile boolean f33958a;
    public Runnable f33959b;
    public final String f33960c;
    public final long d;
    public final String e;
    public final byte[] f33961f;
    public final Utilities.Callback2 h;
    public final m0 f33962n;

    public a0(m0 m0Var, String str, long j10, String str2, byte[] bArr, Utilities.Callback2 callback2) {
        this.f33962n = m0Var;
        this.f33960c = str;
        this.d = j10;
        this.e = str2;
        this.f33961f = bArr;
        this.h = callback2;
    }

    @Override
    public final synchronized void run() {
        if (this.f33958a) {
            return;
        }
        this.f33959b = this.f33962n.f34531b.emulateSend(this.f33960c, this.d, this.e, this.f33961f, new ai.q5(28, this, this.h));
    }
}
