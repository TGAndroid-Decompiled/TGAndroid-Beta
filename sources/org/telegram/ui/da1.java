package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class da1 implements RequestDelegate {
    public final int f35206a;
    public final hb1 f35207b;

    public da1(hb1 hb1Var, int i10) {
        this.f35206a = i10;
        this.f35207b = hb1Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35206a) {
            case 0:
                hb1.U(this.f35207b, tLObject);
                return;
            default:
                hb1.V(this.f35207b, tLObject);
                return;
        }
    }
}
