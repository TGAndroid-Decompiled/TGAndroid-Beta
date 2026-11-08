package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jn implements RequestDelegate {
    public final int f47007a;
    public final pn f47008b;

    public jn(pn pnVar, int i7) {
        this.f47007a = i7;
        this.f47008b = pnVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47007a) {
            case 0:
                org.telegram.messenger.g0.h3(new o1(this.f47008b, tL_error, tLObject, 27));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new ln(this.f47008b, 1));
                return;
            default:
                org.telegram.messenger.g0.h3(new ln(this.f47008b, 4));
                return;
        }
    }
}
