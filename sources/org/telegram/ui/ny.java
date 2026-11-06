package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ny implements RequestDelegate {
    public final int f48166a;
    public final gz f48167b;

    public ny(gz gzVar, int i7) {
        this.f48166a = i7;
        this.f48167b = gzVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48166a) {
            case 0:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.l51(23, this.f48167b, tLObject));
                return;
            default:
                org.telegram.messenger.g0.h3(new rp(this.f48167b, tL_error, tLObject, 6));
                return;
        }
    }
}
