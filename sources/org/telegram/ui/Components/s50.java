package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s50 implements RequestDelegate {
    public final int f39487a;
    public final u50 f39488b;

    public s50(u50 u50Var, int i7) {
        this.f39487a = i7;
        this.f39488b = u50Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39487a) {
            case 0:
                org.telegram.messenger.g0.g3(new g(this.f39488b, tL_error, tLObject, 15));
                return;
            default:
                org.telegram.messenger.g0.g3(new ou(16, this.f39488b, tL_error));
                return;
        }
    }
}
