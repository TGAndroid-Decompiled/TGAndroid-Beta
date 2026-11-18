package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p50 implements RequestDelegate {
    public final int f38274a;
    public final r50 f38275b;

    public p50(r50 r50Var, int i7) {
        this.f38274a = i7;
        this.f38275b = r50Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38274a) {
            case 0:
                org.telegram.messenger.g0.g3(new k7((Object) this.f38275b, (Object) tL_error, (Object) tLObject, 14));
                return;
            default:
                org.telegram.messenger.g0.g3(new dw(14, this.f38275b, tL_error));
                return;
        }
    }
}
