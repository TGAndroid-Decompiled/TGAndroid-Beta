package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n0 implements Runnable {
    public final int f35314a = 1;
    public final Utilities.Callback f35315b;
    public final long f35316c;
    public final long d;
    public final Object f35317e;
    public final Object f35318f;
    public final Object h;

    public n0(long j3, long j10, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, yh.s3 s3Var) {
        this.f35317e = s3Var;
        this.f35315b = callback;
        this.f35318f = tL_error;
        this.h = tLObject;
        this.f35316c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.n0.run():void");
    }

    public n0(p0 p0Var, String str, h0 h0Var, long j3, long j10, Utilities.Callback callback) {
        this.f35317e = p0Var;
        this.f35318f = str;
        this.h = h0Var;
        this.f35316c = j3;
        this.d = j10;
        this.f35315b = callback;
    }
}
