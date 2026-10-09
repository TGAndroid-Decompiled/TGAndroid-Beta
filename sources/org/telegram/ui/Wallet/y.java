package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class y implements Runnable {
    public volatile boolean f35674a;
    public Runnable f35675b;
    public final String f35676c;
    public final long d;
    public final String f35677e;
    public final byte[] f35678f;
    public final Utilities.Callback2 h;
    public final k0 f35679n;

    public y(k0 k0Var, String str, long j3, String str2, byte[] bArr, Utilities.Callback2 callback2) {
        this.f35679n = k0Var;
        this.f35676c = str;
        this.d = j3;
        this.f35677e = str2;
        this.f35678f = bArr;
        this.h = callback2;
    }

    @Override
    public final synchronized void run() {
        if (this.f35674a) {
            return;
        }
        this.f35675b = this.f35679n.f35118b.emulateSend(this.f35676c, this.d, this.f35677e, this.f35678f, new ai.m0(23, this, this.h));
    }
}
