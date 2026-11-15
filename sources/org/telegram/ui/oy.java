package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oy implements RequestDelegate {
    public final int f50057a;
    public final hz f50058b;

    public oy(hz hzVar, int i7) {
        this.f50057a = i7;
        this.f50058b = hzVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50057a) {
            case 0:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.voip.u(19, this.f50058b, tLObject));
                return;
            default:
                org.telegram.messenger.g0.h3(new tp(this.f50058b, tL_error, tLObject, 6));
                return;
        }
    }
}
