package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u50 implements RequestDelegate {
    public final int f30816a;
    public final w50 f30817b;

    public u50(w50 w50Var, int i10) {
        this.f30816a = i10;
        this.f30817b = w50Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f30816a) {
            case 0:
                org.telegram.messenger.i0.g3(new jg(this.f30817b, tL_error, tLObject, 9));
                return;
            default:
                org.telegram.messenger.i0.g3(new at(18, this.f30817b, tL_error));
                return;
        }
    }
}
