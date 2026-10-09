package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b30 implements RequestDelegate {
    public final int f36121a;
    public final g60 f36122b;

    public b30(g60 g60Var, int i10) {
        this.f36121a = i10;
        this.f36122b = g60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36121a) {
            case 0:
                g60.w(this.f36122b, tLObject);
                return;
            default:
                g60.u(this.f36122b, tLObject);
                return;
        }
    }
}
