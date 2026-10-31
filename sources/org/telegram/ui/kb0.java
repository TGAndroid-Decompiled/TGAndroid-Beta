package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kb0 implements RequestDelegate {
    public final int f38733a;
    public final long f38734b;
    public final Object f38735c;

    public kb0(Object obj, long j10, int i10) {
        this.f38733a = i10;
        this.f38735c = obj;
        this.f38734b = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38733a) {
            case 0:
                yb0 yb0Var = (yb0) this.f38735c;
                if (tLObject != null) {
                    org.telegram.messenger.i0.g3(new a3.i0(yb0Var, tLObject, this.f38734b, 21));
                    return;
                }
                return;
            default:
                org.telegram.messenger.i0.g3(new a3.i0((th.e5) this.f38735c, this.f38734b, tLObject, 28));
                return;
        }
    }
}
