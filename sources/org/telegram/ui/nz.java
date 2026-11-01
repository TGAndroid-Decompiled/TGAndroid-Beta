package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nz implements RequestDelegate {
    public final int f39991a;
    public final h00 f39992b;

    public nz(h00 h00Var, int i10) {
        this.f39991a = i10;
        this.f39992b = h00Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39991a) {
            case 0:
                org.telegram.messenger.i0.g3(new org.telegram.ui.Components.voip.u(17, this.f39992b, tLObject));
                return;
            default:
                org.telegram.messenger.i0.g3(new qq(this.f39992b, tL_error, tLObject, 6));
                return;
        }
    }
}
