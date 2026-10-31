package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fo implements RequestDelegate {
    public final int f37304a;
    public final oo f37305b;

    public fo(oo ooVar, int i10) {
        this.f37304a = i10;
        this.f37305b = ooVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37304a) {
            case 0:
                org.telegram.messenger.i0.g3(new p1(this.f37305b, tL_error, tLObject, 27));
                return;
            case 1:
                org.telegram.messenger.i0.g3(new ho(this.f37305b, 1));
                return;
            default:
                org.telegram.messenger.i0.g3(new ho(this.f37305b, 4));
                return;
        }
    }
}
