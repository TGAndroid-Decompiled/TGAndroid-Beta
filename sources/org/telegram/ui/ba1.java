package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ba1 implements RequestDelegate {
    public final int f31210a;
    public final fb1 f31211b;

    public ba1(fb1 fb1Var, int i10) {
        this.f31210a = i10;
        this.f31211b = fb1Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f31210a) {
            case 0:
                fb1.U(this.f31211b, tLObject);
                return;
            default:
                fb1.V(this.f31211b, tLObject);
                return;
        }
    }
}
