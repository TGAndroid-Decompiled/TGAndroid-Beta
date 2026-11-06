package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e50 implements RequestDelegate {
    public final int f33143a;
    public final g50 f33144b;

    public e50(g50 g50Var, int i7) {
        this.f33143a = i7;
        this.f33144b = g50Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f33143a) {
            case 0:
                org.telegram.messenger.g0.h3(new ng(this.f33144b, tL_error, tLObject, 9));
                return;
            default:
                org.telegram.messenger.g0.h3(new fq(24, this.f33144b, tL_error));
                return;
        }
    }
}
