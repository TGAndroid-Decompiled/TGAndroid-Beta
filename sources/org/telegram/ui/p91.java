package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p91 implements RequestDelegate {
    public final int f36357a;
    public final ra1 f36358b;

    public p91(ra1 ra1Var, int i10) {
        this.f36357a = i10;
        this.f36358b = ra1Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36357a) {
            case 0:
                ra1.V(this.f36358b, tLObject);
                return;
            default:
                ra1.U(this.f36358b, tLObject);
                return;
        }
    }
}
