package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jb0 implements RequestDelegate {
    public final int f38333a;
    public final long f38334b;
    public final Object f38335c;

    public jb0(Object obj, long j10, int i10) {
        this.f38333a = i10;
        this.f38335c = obj;
        this.f38334b = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38333a) {
            case 0:
                xb0 xb0Var = (xb0) this.f38335c;
                if (tLObject != null) {
                    org.telegram.messenger.i0.g3(new a3.i0(xb0Var, tLObject, this.f38334b, 21));
                    return;
                }
                return;
            default:
                org.telegram.messenger.i0.g3(new a3.i0((th.e5) this.f38335c, this.f38334b, tLObject, 28));
                return;
        }
    }
}
