package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g70 implements RequestDelegate {
    public final int f28449a;
    public final i70 f28450b;

    public g70(i70 i70Var, int i10) {
        this.f28449a = i10;
        this.f28450b = i70Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f28449a) {
            case 0:
                AndroidUtilities.runOnUIThread(new kg(this.f28450b, tL_error, tLObject, 11));
                return;
            default:
                AndroidUtilities.runOnUIThread(new so(27, this.f28450b, tL_error));
                return;
        }
    }
}
