package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class z implements Runnable {
    public volatile boolean f35571a;
    public Runnable f35572b;
    public final String f35573c;
    public final long d;
    public final String f35574e;
    public final byte[] f35575f;
    public final Utilities.Callback2 h;
    public final l0 f35576n;

    public z(l0 l0Var, String str, long j3, String str2, byte[] bArr, Utilities.Callback2 callback2) {
        this.f35576n = l0Var;
        this.f35573c = str;
        this.d = j3;
        this.f35574e = str2;
        this.f35575f = bArr;
        this.h = callback2;
    }

    @Override
    public final synchronized void run() {
        if (this.f35571a) {
            return;
        }
        this.f35572b = this.f35576n.f34997b.emulateSend(this.f35573c, this.d, this.f35574e, this.f35575f, new ai.m0(23, this, this.h));
    }
}
