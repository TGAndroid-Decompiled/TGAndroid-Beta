package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n0 implements Runnable {
    public final int f35248a = 1;
    public final Utilities.Callback f35249b;
    public final long f35250c;
    public final long d;
    public final Object f35251e;
    public final Object f35252f;
    public final Object h;

    public n0(long j3, long j10, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, yh.s3 s3Var) {
        this.f35251e = s3Var;
        this.f35249b = callback;
        this.f35252f = tL_error;
        this.h = tLObject;
        this.f35250c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.n0.run():void");
    }

    public n0(p0 p0Var, String str, h0 h0Var, long j3, long j10, Utilities.Callback callback) {
        this.f35251e = p0Var;
        this.f35252f = str;
        this.h = h0Var;
        this.f35250c = j3;
        this.d = j10;
        this.f35249b = callback;
    }
}
