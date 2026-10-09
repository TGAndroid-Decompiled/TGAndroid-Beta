package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class y implements Runnable {
    public volatile boolean f35637a;
    public Runnable f35638b;
    public final String f35639c;
    public final long d;
    public final String f35640e;
    public final byte[] f35641f;
    public final Utilities.Callback2 h;
    public final k0 f35642n;

    public y(k0 k0Var, String str, long j3, String str2, byte[] bArr, Utilities.Callback2 callback2) {
        this.f35642n = k0Var;
        this.f35639c = str;
        this.d = j3;
        this.f35640e = str2;
        this.f35641f = bArr;
        this.h = callback2;
    }

    @Override
    public final synchronized void run() {
        if (this.f35637a) {
            return;
        }
        this.f35638b = this.f35642n.f35094b.emulateSend(this.f35639c, this.d, this.f35640e, this.f35641f, new ai.m0(23, this, this.h));
    }
}
