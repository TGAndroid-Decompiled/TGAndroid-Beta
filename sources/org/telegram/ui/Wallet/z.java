package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class z implements Runnable {
    public volatile boolean f35569a;
    public Runnable f35570b;
    public final String f35571c;
    public final long d;
    public final String f35572e;
    public final byte[] f35573f;
    public final Utilities.Callback2 h;
    public final l0 f35574n;

    public z(l0 l0Var, String str, long j3, String str2, byte[] bArr, Utilities.Callback2 callback2) {
        this.f35574n = l0Var;
        this.f35571c = str;
        this.d = j3;
        this.f35572e = str2;
        this.f35573f = bArr;
        this.h = callback2;
    }

    @Override
    public final synchronized void run() {
        if (this.f35569a) {
            return;
        }
        this.f35570b = this.f35574n.f34995b.emulateSend(this.f35571c, this.d, this.f35572e, this.f35573f, new ai.m0(23, this, this.h));
    }
}
