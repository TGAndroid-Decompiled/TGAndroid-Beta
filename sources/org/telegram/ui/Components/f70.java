package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f70 implements RequestDelegate {
    public final int f28076a;
    public final h70 f28077b;

    public f70(h70 h70Var, int i10) {
        this.f28076a = i10;
        this.f28077b = h70Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f28076a) {
            case 0:
                AndroidUtilities.runOnUIThread(new kg(this.f28077b, tL_error, tLObject, 11));
                return;
            default:
                AndroidUtilities.runOnUIThread(new so(27, this.f28077b, tL_error));
                return;
        }
    }
}
