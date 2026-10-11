package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o0 implements Runnable {
    public final int f35344a = 1;
    public final Utilities.Callback f35345b;
    public final long f35346c;
    public final long d;
    public final Object f35347e;
    public final Object f35348f;
    public final Object h;

    public o0(long j3, long j10, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, yh.s3 s3Var) {
        this.f35347e = s3Var;
        this.f35345b = callback;
        this.f35348f = tL_error;
        this.h = tLObject;
        this.f35346c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.o0.run():void");
    }

    public o0(q0 q0Var, String str, i0 i0Var, long j3, long j10, Utilities.Callback callback) {
        this.f35347e = q0Var;
        this.f35348f = str;
        this.h = i0Var;
        this.f35346c = j3;
        this.d = j10;
        this.f35345b = callback;
    }
}
