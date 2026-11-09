package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ln implements RequestDelegate {
    public final int f47650a;
    public final rn f47651b;

    public ln(rn rnVar, int i7) {
        this.f47650a = i7;
        this.f47651b = rnVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47650a) {
            case 0:
                org.telegram.messenger.g0.h3(new o1(this.f47651b, tL_error, tLObject, 27));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new nn(this.f47651b, 1));
                return;
            default:
                org.telegram.messenger.g0.h3(new nn(this.f47651b, 4));
                return;
        }
    }
}
