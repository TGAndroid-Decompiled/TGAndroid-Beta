package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o91 implements RequestDelegate {
    public final int f36110a;
    public final sa1 f36111b;

    public o91(sa1 sa1Var, int i10) {
        this.f36110a = i10;
        this.f36111b = sa1Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36110a) {
            case 0:
                sa1.U(this.f36111b, tLObject);
                return;
            default:
                sa1.V(this.f36111b, tLObject);
                return;
        }
    }
}
