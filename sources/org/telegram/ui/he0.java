package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class he0 implements RequestDelegate {
    public final int f45911a;
    public final xe0 f45912b;

    public he0(xe0 xe0Var, int i3) {
        this.f45911a = i3;
        this.f45912b = xe0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45911a) {
            case 0:
                org.telegram.messenger.g0.h3(new me0(this.f45912b, tL_error, tLObject, 0));
                return;
            default:
                org.telegram.messenger.g0.h3(new tb0(12, this.f45912b, tL_error));
                return;
        }
    }
}
