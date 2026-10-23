package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class a0 implements Runnable {
    public volatile boolean f33970a;
    public Runnable f33971b;
    public final String f33972c;
    public final long d;
    public final String e;
    public final byte[] f33973f;
    public final Utilities.Callback2 h;
    public final m0 f33974n;

    public a0(m0 m0Var, String str, long j10, String str2, byte[] bArr, Utilities.Callback2 callback2) {
        this.f33974n = m0Var;
        this.f33972c = str;
        this.d = j10;
        this.e = str2;
        this.f33973f = bArr;
        this.h = callback2;
    }

    @Override
    public final synchronized void run() {
        if (this.f33970a) {
            return;
        }
        this.f33971b = this.f33974n.f34482b.emulateSend(this.f33972c, this.d, this.e, this.f33973f, new ai.r5(28, this, this.h));
    }
}
