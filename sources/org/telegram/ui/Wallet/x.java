package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class x implements Runnable {
    public volatile boolean f33822a;
    public Runnable f33823b;
    public final String f33824c;
    public final long d;
    public final String e;
    public final byte[] f33825f;
    public final Utilities.Callback2 h;
    public final j0 f33826n;

    public x(j0 j0Var, String str, long j10, String str2, byte[] bArr, Utilities.Callback2 callback2) {
        this.f33826n = j0Var;
        this.f33824c = str;
        this.d = j10;
        this.e = str2;
        this.f33825f = bArr;
        this.h = callback2;
    }

    @Override
    public final synchronized void run() {
        if (this.f33822a) {
            return;
        }
        this.f33823b = this.f33826n.f33320b.emulateSend(this.f33824c, this.d, this.e, this.f33825f, new bi.f0(23, this, this.h));
    }
}
