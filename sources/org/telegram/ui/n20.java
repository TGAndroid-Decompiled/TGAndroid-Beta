package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n20 implements RequestDelegate {
    public final int f39699a;
    public final u50 f39700b;

    public n20(u50 u50Var, int i10) {
        this.f39699a = i10;
        this.f39700b = u50Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39699a) {
            case 0:
                u50.v(this.f39700b, tLObject);
                return;
            default:
                u50.t(this.f39700b, tLObject);
                return;
        }
    }
}
