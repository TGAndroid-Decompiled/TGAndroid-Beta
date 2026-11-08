package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e50 implements RequestDelegate {
    public final int f33202a;
    public final g50 f33203b;

    public e50(g50 g50Var, int i7) {
        this.f33202a = i7;
        this.f33203b = g50Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f33202a) {
            case 0:
                org.telegram.messenger.g0.h3(new ng(this.f33203b, tL_error, tLObject, 9));
                return;
            default:
                org.telegram.messenger.g0.h3(new fq(24, this.f33203b, tL_error));
                return;
        }
    }
}
