package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jn implements RequestDelegate {
    public final int f46986a;
    public final pn f46987b;

    public jn(pn pnVar, int i7) {
        this.f46986a = i7;
        this.f46987b = pnVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f46986a) {
            case 0:
                org.telegram.messenger.g0.h3(new o1(this.f46987b, tL_error, tLObject, 27));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new ln(this.f46987b, 1));
                return;
            default:
                org.telegram.messenger.g0.h3(new ln(this.f46987b, 4));
                return;
        }
    }
}
