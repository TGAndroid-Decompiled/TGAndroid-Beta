package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n0 implements Runnable {
    public final int f33227a = 1;
    public final Utilities.Callback f33228b;
    public final long f33229c;
    public final long d;
    public final Object e;
    public final Object f33230f;
    public final Object h;

    public n0(long j10, long j11, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, zh.r3 r3Var) {
        this.e = r3Var;
        this.f33228b = callback;
        this.f33230f = tL_error;
        this.h = tLObject;
        this.f33229c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.n0.run():void");
    }

    public n0(p0 p0Var, String str, h0 h0Var, long j10, long j11, Utilities.Callback callback) {
        this.e = p0Var;
        this.f33230f = str;
        this.h = h0Var;
        this.f33229c = j10;
        this.d = j11;
        this.f33228b = callback;
    }
}
