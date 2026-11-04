package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fn implements RequestDelegate {
    public final int f45310a;
    public final ln f45311b;

    public fn(ln lnVar, int i3) {
        this.f45310a = i3;
        this.f45311b = lnVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45310a) {
            case 0:
                org.telegram.messenger.g0.h3(new p1(this.f45311b, tL_error, tLObject, 27));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new hn(this.f45311b, 1));
                return;
            default:
                org.telegram.messenger.g0.h3(new hn(this.f45311b, 4));
                return;
        }
    }
}
