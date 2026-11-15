package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h50 implements RequestDelegate {
    public final int f35168a;
    public final j50 f35169b;

    public h50(j50 j50Var, int i7) {
        this.f35168a = i7;
        this.f35169b = j50Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35168a) {
            case 0:
                org.telegram.messenger.g0.h3(new yf(this.f35169b, tL_error, tLObject, 11));
                return;
            default:
                org.telegram.messenger.g0.h3(new vs(18, this.f35169b, tL_error));
                return;
        }
    }
}
