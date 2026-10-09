package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n0 implements Runnable {
    public final int f35268a = 1;
    public final Utilities.Callback f35269b;
    public final long f35270c;
    public final long d;
    public final Object f35271e;
    public final Object f35272f;
    public final Object h;

    public n0(long j3, long j10, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, yh.s3 s3Var) {
        this.f35271e = s3Var;
        this.f35269b = callback;
        this.f35272f = tL_error;
        this.h = tLObject;
        this.f35270c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.n0.run():void");
    }

    public n0(p0 p0Var, String str, h0 h0Var, long j3, long j10, Utilities.Callback callback) {
        this.f35271e = p0Var;
        this.f35272f = str;
        this.h = h0Var;
        this.f35270c = j3;
        this.d = j10;
        this.f35269b = callback;
    }
}
