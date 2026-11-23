package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kn implements RequestDelegate {
    public final int f49317a;
    public final rn f49318b;

    public kn(rn rnVar, int i7) {
        this.f49317a = i7;
        this.f49318b = rnVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f49317a) {
            case 0:
                org.telegram.messenger.g0.g3(new o1(this.f49318b, tL_error, tLObject, 27));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new mn(this.f49318b, 1));
                return;
            default:
                org.telegram.messenger.g0.g3(new mn(this.f49318b, 4));
                return;
        }
    }
}
