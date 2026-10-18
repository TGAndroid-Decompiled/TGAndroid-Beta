package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class a0 implements Runnable {
    public volatile boolean f33951a;
    public Runnable f33952b;
    public final String f33953c;
    public final long d;
    public final String e;
    public final byte[] f33954f;
    public final Utilities.Callback2 h;
    public final m0 f33955n;

    public a0(m0 m0Var, String str, long j10, String str2, byte[] bArr, Utilities.Callback2 callback2) {
        this.f33955n = m0Var;
        this.f33953c = str;
        this.d = j10;
        this.e = str2;
        this.f33954f = bArr;
        this.h = callback2;
    }

    @Override
    public final synchronized void run() {
        if (this.f33951a) {
            return;
        }
        this.f33952b = this.f33955n.f34452b.emulateSend(this.f33953c, this.d, this.e, this.f33954f, new ai.q5(28, this, this.h));
    }
}
