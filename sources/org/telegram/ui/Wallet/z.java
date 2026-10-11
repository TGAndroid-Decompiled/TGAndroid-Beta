package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class z implements Runnable {
    public volatile boolean f35759a;
    public Runnable f35760b;
    public final String f35761c;
    public final long d;
    public final String f35762e;
    public final byte[] f35763f;
    public final Utilities.Callback2 h;
    public final l0 f35764n;

    public z(l0 l0Var, String str, long j3, String str2, byte[] bArr, Utilities.Callback2 callback2) {
        this.f35764n = l0Var;
        this.f35761c = str;
        this.d = j3;
        this.f35762e = str2;
        this.f35763f = bArr;
        this.h = callback2;
    }

    @Override
    public final synchronized void run() {
        if (this.f35759a) {
            return;
        }
        this.f35760b = this.f35764n.f35186b.emulateSend(this.f35761c, this.d, this.f35762e, this.f35763f, new ai.m0(23, this, this.h));
    }
}
