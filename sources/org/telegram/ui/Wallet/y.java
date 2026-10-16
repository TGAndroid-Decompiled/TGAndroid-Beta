package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class y implements Runnable {
    public volatile boolean f33594a;
    public Runnable f33595b;
    public final String f33596c;
    public final long d;
    public final String e;
    public final byte[] f33597f;
    public final Utilities.Callback2 h;
    public final k0 f33598n;

    public y(k0 k0Var, String str, long j10, String str2, byte[] bArr, Utilities.Callback2 callback2) {
        this.f33598n = k0Var;
        this.f33596c = str;
        this.d = j10;
        this.e = str2;
        this.f33597f = bArr;
        this.h = callback2;
    }

    @Override
    public final synchronized void run() {
        if (this.f33594a) {
            return;
        }
        this.f33595b = this.f33598n.f33093b.emulateSend(this.f33596c, this.d, this.e, this.f33597f, new bi.f0(23, this, this.h));
    }
}
