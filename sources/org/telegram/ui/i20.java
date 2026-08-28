package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i20 implements RequestDelegate {
    public final int f38991a;
    public final o50 f38992b;

    public i20(o50 o50Var, int i9) {
        this.f38991a = i9;
        this.f38992b = o50Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38991a) {
            case 0:
                o50.u(this.f38992b, tLObject);
                return;
            default:
                o50.s(this.f38992b, tLObject);
                return;
        }
    }
}
