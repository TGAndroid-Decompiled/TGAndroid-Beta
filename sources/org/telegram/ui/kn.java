package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kn implements RequestDelegate {
    public final int f49366a;
    public final rn f49367b;

    public kn(rn rnVar, int i7) {
        this.f49366a = i7;
        this.f49367b = rnVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f49366a) {
            case 0:
                org.telegram.messenger.g0.g3(new o1(this.f49367b, tL_error, tLObject, 27));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new mn(this.f49367b, 1));
                return;
            default:
                org.telegram.messenger.g0.g3(new mn(this.f49367b, 4));
                return;
        }
    }
}
