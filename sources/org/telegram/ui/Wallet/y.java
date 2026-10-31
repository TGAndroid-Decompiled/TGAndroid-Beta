package org.telegram.ui.Wallet;

import org.telegram.messenger.j20;
public final class y implements Runnable {
    public volatile boolean f35396a;
    public Runnable f35397b;
    public final String f35398c;
    public final long d;
    public final String e;
    public final byte[] f35399f;
    public final j20 h;
    public final k0 f35400n;

    public y(k0 k0Var, String str, long j10, String str2, byte[] bArr, j20 j20Var) {
        this.f35400n = k0Var;
        this.f35398c = str;
        this.d = j10;
        this.e = str2;
        this.f35399f = bArr;
        this.h = j20Var;
    }

    @Override
    public final synchronized void run() {
        if (this.f35396a) {
            return;
        }
        this.f35397b = this.f35400n.f34777b.emulateSend(this.f35398c, this.d, this.e, this.f35399f, new ih.s(21, this, this.h));
    }
}
