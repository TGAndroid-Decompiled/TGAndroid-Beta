package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p50 implements RequestDelegate {
    public final int f38387a;
    public final r50 f38388b;

    public p50(r50 r50Var, int i7) {
        this.f38387a = i7;
        this.f38388b = r50Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38387a) {
            case 0:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Cells.fa(this.f38388b, tL_error, tLObject, 16));
                return;
            default:
                org.telegram.messenger.g0.g3(new bt(18, this.f38388b, tL_error));
                return;
        }
    }
}
