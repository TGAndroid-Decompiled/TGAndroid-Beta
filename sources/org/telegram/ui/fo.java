package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fo implements RequestDelegate {
    public final int f37194a;
    public final oo f37195b;

    public fo(oo ooVar, int i10) {
        this.f37194a = i10;
        this.f37195b = ooVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37194a) {
            case 0:
                org.telegram.messenger.i0.g3(new p1(this.f37195b, tL_error, tLObject, 27));
                return;
            case 1:
                org.telegram.messenger.i0.g3(new ho(this.f37195b, 1));
                return;
            default:
                org.telegram.messenger.i0.g3(new ho(this.f37195b, 4));
                return;
        }
    }
}
