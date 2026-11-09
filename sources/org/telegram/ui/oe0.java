package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oe0 implements RequestDelegate {
    public final int f48437a;
    public final ef0 f48438b;

    public oe0(ef0 ef0Var, int i7) {
        this.f48437a = i7;
        this.f48438b = ef0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48437a) {
            case 0:
                org.telegram.messenger.g0.h3(new te0(this.f48438b, tL_error, tLObject, 0));
                return;
            default:
                org.telegram.messenger.g0.h3(new bd0(8, this.f48438b, tL_error));
                return;
        }
    }
}
