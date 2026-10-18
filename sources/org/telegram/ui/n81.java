package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n81 implements RequestDelegate {
    public final int f39359a;
    public final r91 f39360b;

    public n81(r91 r91Var, int i10) {
        this.f39359a = i10;
        this.f39360b = r91Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39359a) {
            case 0:
                r91.U(this.f39360b, tLObject);
                return;
            default:
                r91.V(this.f39360b, tLObject);
                return;
        }
    }
}
