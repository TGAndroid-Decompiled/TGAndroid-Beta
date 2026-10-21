package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class a0 implements Runnable {
    public volatile boolean f33966a;
    public Runnable f33967b;
    public final String f33968c;
    public final long d;
    public final String e;
    public final byte[] f33969f;
    public final Utilities.Callback2 h;
    public final m0 f33970n;

    public a0(m0 m0Var, String str, long j10, String str2, byte[] bArr, Utilities.Callback2 callback2) {
        this.f33970n = m0Var;
        this.f33968c = str;
        this.d = j10;
        this.e = str2;
        this.f33969f = bArr;
        this.h = callback2;
    }

    @Override
    public final synchronized void run() {
        if (this.f33966a) {
            return;
        }
        this.f33967b = this.f33970n.f34478b.emulateSend(this.f33968c, this.d, this.e, this.f33969f, new ai.r5(28, this, this.h));
    }
}
