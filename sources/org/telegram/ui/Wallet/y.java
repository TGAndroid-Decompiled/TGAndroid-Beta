package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class y implements Runnable {
    public volatile boolean f35729a;
    public Runnable f35730b;
    public final String f35731c;
    public final long d;
    public final String f35732e;
    public final byte[] f35733f;
    public final Utilities.Callback2 h;
    public final k0 f35734n;

    public y(k0 k0Var, String str, long j3, String str2, byte[] bArr, Utilities.Callback2 callback2) {
        this.f35734n = k0Var;
        this.f35731c = str;
        this.d = j3;
        this.f35732e = str2;
        this.f35733f = bArr;
        this.h = callback2;
    }

    @Override
    public final synchronized void run() {
        if (this.f35729a) {
            return;
        }
        this.f35730b = this.f35734n.f35156b.emulateSend(this.f35731c, this.d, this.f35732e, this.f35733f, new ai.m0(23, this, this.h));
    }
}
