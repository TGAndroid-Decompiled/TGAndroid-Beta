package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n91 implements RequestDelegate {
    public final int f38859a;
    public final va1 f38860b;

    public n91(va1 va1Var, int i10) {
        this.f38859a = i10;
        this.f38860b = va1Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38859a) {
            case 0:
                va1.T(this.f38860b, tLObject);
                return;
            default:
                va1.S(this.f38860b, tLObject);
                return;
        }
    }
}
