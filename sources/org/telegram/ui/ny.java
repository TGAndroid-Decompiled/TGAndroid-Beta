package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ny implements RequestDelegate {
    public final int f48167a;
    public final gz f48168b;

    public ny(gz gzVar, int i7) {
        this.f48167a = i7;
        this.f48168b = gzVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48167a) {
            case 0:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.k51(23, this.f48168b, tLObject));
                return;
            default:
                org.telegram.messenger.g0.h3(new rp(this.f48168b, tL_error, tLObject, 6));
                return;
        }
    }
}
