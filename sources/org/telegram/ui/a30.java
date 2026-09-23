package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a30 implements RequestDelegate {
    public final int f31648a;
    public final f60 f31649b;

    public a30(f60 f60Var, int i10) {
        this.f31648a = i10;
        this.f31649b = f60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f31648a) {
            case 0:
                f60.u(this.f31649b, tLObject);
                return;
            default:
                f60.s(this.f31649b, tLObject);
                return;
        }
    }
}
