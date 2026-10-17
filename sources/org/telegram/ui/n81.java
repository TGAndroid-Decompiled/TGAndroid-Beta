package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n81 implements RequestDelegate {
    public final int f39374a;
    public final r91 f39375b;

    public n81(r91 r91Var, int i10) {
        this.f39374a = i10;
        this.f39375b = r91Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39374a) {
            case 0:
                r91.U(this.f39375b, tLObject);
                return;
            default:
                r91.V(this.f39375b, tLObject);
                return;
        }
    }
}
