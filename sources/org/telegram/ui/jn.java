package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jn implements RequestDelegate {
    public final int f48430a;
    public final qn f48431b;

    public jn(qn qnVar, int i7) {
        this.f48430a = i7;
        this.f48431b = qnVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48430a) {
            case 0:
                org.telegram.messenger.g0.h3(new o1(this.f48431b, tL_error, tLObject, 27));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new ln(this.f48431b, 1));
                return;
            default:
                org.telegram.messenger.g0.h3(new ln(this.f48431b, 4));
                return;
        }
    }
}
