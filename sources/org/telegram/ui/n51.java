package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n51 implements RequestDelegate {
    public final int f39830a;
    public final u61 f39831b;

    public n51(u61 u61Var, int i10) {
        this.f39830a = i10;
        this.f39831b = u61Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39830a) {
            case 0:
                u61.Z(this.f39831b, tLObject);
                return;
            default:
                u61.Y(this.f39831b, tLObject);
                return;
        }
    }
}
