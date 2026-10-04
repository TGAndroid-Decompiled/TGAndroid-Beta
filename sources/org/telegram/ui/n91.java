package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n91 implements RequestDelegate {
    public final int f38860a;
    public final va1 f38861b;

    public n91(va1 va1Var, int i10) {
        this.f38860a = i10;
        this.f38861b = va1Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38860a) {
            case 0:
                va1.T(this.f38861b, tLObject);
                return;
            default:
                va1.S(this.f38861b, tLObject);
                return;
        }
    }
}
