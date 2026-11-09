package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f50 implements RequestDelegate {
    public final int f33582a;
    public final h50 f33583b;

    public f50(h50 h50Var, int i7) {
        this.f33582a = i7;
        this.f33583b = h50Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f33582a) {
            case 0:
                org.telegram.messenger.g0.h3(new ng(this.f33583b, tL_error, tLObject, 9));
                return;
            default:
                org.telegram.messenger.g0.h3(new fq(24, this.f33583b, tL_error));
                return;
        }
    }
}
