package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n91 implements RequestDelegate {
    public final int f38865a;
    public final va1 f38866b;

    public n91(va1 va1Var, int i10) {
        this.f38865a = i10;
        this.f38866b = va1Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38865a) {
            case 0:
                va1.T(this.f38866b, tLObject);
                return;
            default:
                va1.S(this.f38866b, tLObject);
                return;
        }
    }
}
