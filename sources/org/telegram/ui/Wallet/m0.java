package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m0 implements Runnable {
    public final int f33458a = 1;
    public final Utilities.Callback f33459b;
    public final long f33460c;
    public final long d;
    public final Object e;
    public final Object f33461f;
    public final Object h;

    public m0(long j10, long j11, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, zh.r3 r3Var) {
        this.e = r3Var;
        this.f33459b = callback;
        this.f33461f = tL_error;
        this.h = tLObject;
        this.f33460c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.m0.run():void");
    }

    public m0(o0 o0Var, String str, g0 g0Var, long j10, long j11, Utilities.Callback callback) {
        this.e = o0Var;
        this.f33461f = str;
        this.h = g0Var;
        this.f33460c = j10;
        this.d = j11;
        this.f33459b = callback;
    }
}
