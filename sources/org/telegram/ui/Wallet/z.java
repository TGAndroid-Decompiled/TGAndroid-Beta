package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class z implements Runnable {
    public volatile boolean f35793a;
    public Runnable f35794b;
    public final String f35795c;
    public final long d;
    public final String f35796e;
    public final byte[] f35797f;
    public final Utilities.Callback2 h;
    public final l0 f35798n;

    public z(l0 l0Var, String str, long j3, String str2, byte[] bArr, Utilities.Callback2 callback2) {
        this.f35798n = l0Var;
        this.f35795c = str;
        this.d = j3;
        this.f35796e = str2;
        this.f35797f = bArr;
        this.h = callback2;
    }

    @Override
    public final synchronized void run() {
        if (this.f35793a) {
            return;
        }
        this.f35794b = this.f35798n.f35220b.emulateSend(this.f35795c, this.d, this.f35796e, this.f35797f, new ai.m0(23, this, this.h));
    }
}
