package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qi0 implements RequestDelegate {
    public final int f48900a;
    public final yj0 f48901b;

    public qi0(yj0 yj0Var, int i3) {
        this.f48900a = i3;
        this.f48901b = yj0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48900a) {
            case 0:
                org.telegram.messenger.g0.h3(new hc0(this.f48901b, tL_error, tLObject, false, 13));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new tb0(25, this.f48901b, tL_error));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new mi0(this.f48901b, 5));
                return;
            default:
                org.telegram.messenger.g0.h3(new tb0(24, this.f48901b, tLObject));
                return;
        }
    }
}
