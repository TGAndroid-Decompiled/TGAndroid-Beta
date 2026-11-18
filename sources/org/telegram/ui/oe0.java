package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oe0 implements RequestDelegate {
    public final int f50597a;
    public final ff0 f50598b;

    public oe0(ff0 ff0Var, int i7) {
        this.f50597a = i7;
        this.f50598b = ff0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50597a) {
            case 0:
                org.telegram.messenger.g0.g3(new te0(this.f50598b, tL_error, tLObject, 0));
                return;
            default:
                org.telegram.messenger.g0.g3(new n60(29, this.f50598b, tL_error));
                return;
        }
    }
}
