package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b30 implements RequestDelegate {
    public final int f36165a;
    public final g60 f36166b;

    public b30(g60 g60Var, int i10) {
        this.f36165a = i10;
        this.f36166b = g60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36165a) {
            case 0:
                g60.w(this.f36166b, tLObject);
                return;
            default:
                g60.u(this.f36166b, tLObject);
                return;
        }
    }
}
