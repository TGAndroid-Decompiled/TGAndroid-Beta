package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class z implements Runnable {
    public volatile boolean f35464a;
    public Runnable f35465b;
    public final String f35466c;
    public final long d;
    public final String e;
    public final byte[] f35467f;
    public final Utilities.Callback2 h;
    public final l0 f35468n;

    public z(l0 l0Var, String str, long j10, String str2, byte[] bArr, Utilities.Callback2 callback2) {
        this.f35468n = l0Var;
        this.f35466c = str;
        this.d = j10;
        this.e = str2;
        this.f35467f = bArr;
        this.h = callback2;
    }

    @Override
    public final synchronized void run() {
        if (this.f35464a) {
            return;
        }
        this.f35465b = this.f35468n.f34742b.emulateSend(this.f35466c, this.d, this.e, this.f35467f, new ai.r5(28, this, this.h));
    }
}
