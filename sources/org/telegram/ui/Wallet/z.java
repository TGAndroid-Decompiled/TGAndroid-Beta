package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class z implements Runnable {
    public volatile boolean f35466a;
    public Runnable f35467b;
    public final String f35468c;
    public final long d;
    public final String e;
    public final byte[] f35469f;
    public final Utilities.Callback2 h;
    public final l0 f35470n;

    public z(l0 l0Var, String str, long j10, String str2, byte[] bArr, Utilities.Callback2 callback2) {
        this.f35470n = l0Var;
        this.f35468c = str;
        this.d = j10;
        this.e = str2;
        this.f35469f = bArr;
        this.h = callback2;
    }

    @Override
    public final synchronized void run() {
        if (this.f35466a) {
            return;
        }
        this.f35467b = this.f35470n.f34744b.emulateSend(this.f35468c, this.d, this.e, this.f35469f, new ai.r5(28, this, this.h));
    }
}
