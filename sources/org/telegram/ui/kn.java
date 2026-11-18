package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kn implements RequestDelegate {
    public final int f49315a;
    public final rn f49316b;

    public kn(rn rnVar, int i7) {
        this.f49315a = i7;
        this.f49316b = rnVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f49315a) {
            case 0:
                org.telegram.messenger.g0.g3(new o1(this.f49316b, tL_error, tLObject, 27));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new mn(this.f49316b, 1));
                return;
            default:
                org.telegram.messenger.g0.g3(new mn(this.f49316b, 4));
                return;
        }
    }
}
