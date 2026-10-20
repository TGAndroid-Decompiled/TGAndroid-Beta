package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class a0 implements Runnable {
    public volatile boolean f33965a;
    public Runnable f33966b;
    public final String f33967c;
    public final long d;
    public final String e;
    public final byte[] f33968f;
    public final Utilities.Callback2 h;
    public final m0 f33969n;

    public a0(m0 m0Var, String str, long j10, String str2, byte[] bArr, Utilities.Callback2 callback2) {
        this.f33969n = m0Var;
        this.f33967c = str;
        this.d = j10;
        this.e = str2;
        this.f33968f = bArr;
        this.h = callback2;
    }

    @Override
    public final synchronized void run() {
        if (this.f33965a) {
            return;
        }
        this.f33966b = this.f33969n.f34477b.emulateSend(this.f33967c, this.d, this.e, this.f33968f, new ai.r5(28, this, this.h));
    }
}
