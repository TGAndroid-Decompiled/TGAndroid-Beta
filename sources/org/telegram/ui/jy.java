package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jy implements RequestDelegate {
    public final int f46709a;
    public final ez f46710b;

    public jy(ez ezVar, int i3) {
        this.f46709a = i3;
        this.f46710b = ezVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f46709a) {
            case 0:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.p11(28, this.f46710b, tLObject));
                return;
            default:
                org.telegram.messenger.g0.h3(new pp(this.f46710b, tL_error, tLObject, 6));
                return;
        }
    }
}
