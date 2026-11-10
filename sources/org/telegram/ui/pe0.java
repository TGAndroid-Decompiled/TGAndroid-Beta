package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pe0 implements RequestDelegate {
    public final int f48758a;
    public final ff0 f48759b;

    public pe0(ff0 ff0Var, int i7) {
        this.f48758a = i7;
        this.f48759b = ff0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48758a) {
            case 0:
                org.telegram.messenger.g0.h3(new ue0(this.f48759b, tL_error, tLObject, 0));
                return;
            default:
                org.telegram.messenger.g0.h3(new tc0(9, this.f48759b, tL_error));
                return;
        }
    }
}
