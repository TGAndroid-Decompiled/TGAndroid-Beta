package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ck0 implements RequestDelegate {
    public final int f36477a;
    public final ll0 f36478b;

    public ck0(ll0 ll0Var, int i10) {
        this.f36477a = i10;
        this.f36478b = ll0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36477a) {
            case 0:
                org.telegram.messenger.i0.g3(new qd0(this.f36478b, tL_error, tLObject, false, 13));
                return;
            case 1:
                org.telegram.messenger.i0.g3(new uf0(13, this.f36478b, tL_error));
                return;
            case 2:
                org.telegram.messenger.i0.g3(new xj0(this.f36478b, 5));
                return;
            default:
                org.telegram.messenger.i0.g3(new uf0(12, this.f36478b, tLObject));
                return;
        }
    }
}
