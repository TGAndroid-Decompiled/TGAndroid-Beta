package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v60 implements RequestDelegate {
    public final int f28993a;
    public final x60 f28994b;

    public v60(x60 x60Var, int i10) {
        this.f28993a = i10;
        this.f28994b = x60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f28993a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o(this.f28994b, tL_error, tLObject, 22));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ww(15, this.f28994b, tL_error));
                return;
        }
    }
}
