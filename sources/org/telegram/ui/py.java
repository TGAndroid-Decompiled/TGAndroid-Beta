package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class py implements RequestDelegate {
    public final int f48830a;
    public final iz f48831b;

    public py(iz izVar, int i7) {
        this.f48830a = i7;
        this.f48831b = izVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48830a) {
            case 0:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.m51(23, this.f48831b, tLObject));
                return;
            default:
                org.telegram.messenger.g0.h3(new tp(this.f48831b, tL_error, tLObject, 6));
                return;
        }
    }
}
