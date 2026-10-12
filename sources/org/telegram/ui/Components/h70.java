package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h70 implements RequestDelegate {
    public final int f25530a;
    public final j70 f25531b;

    public h70(j70 j70Var, int i10) {
        this.f25530a = i10;
        this.f25531b = j70Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f25530a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n2.h(this.f25531b, tL_error, tLObject, 28));
                return;
            default:
                AndroidUtilities.runOnUIThread(new f60(3, this.f25531b, tL_error));
                return;
        }
    }
}
