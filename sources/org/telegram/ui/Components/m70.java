package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m70 implements RequestDelegate {
    public final int f28581a;
    public final o70 f28582b;

    public m70(o70 o70Var, int i10) {
        this.f28581a = i10;
        this.f28582b = o70Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f28581a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f(this.f28582b, tL_error, tLObject, 25));
                return;
            default:
                AndroidUtilities.runOnUIThread(new bs(21, this.f28582b, tL_error));
                return;
        }
    }
}
