package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class a0 implements Runnable {
    public volatile boolean f33959a;
    public Runnable f33960b;
    public final String f33961c;
    public final long d;
    public final String e;
    public final byte[] f33962f;
    public final Utilities.Callback2 h;
    public final m0 f33963n;

    public a0(m0 m0Var, String str, long j10, String str2, byte[] bArr, Utilities.Callback2 callback2) {
        this.f33963n = m0Var;
        this.f33961c = str;
        this.d = j10;
        this.e = str2;
        this.f33962f = bArr;
        this.h = callback2;
    }

    @Override
    public final synchronized void run() {
        if (this.f33959a) {
            return;
        }
        this.f33960b = this.f33963n.f34471b.emulateSend(this.f33961c, this.d, this.e, this.f33962f, new ai.r5(28, this, this.h));
    }
}
