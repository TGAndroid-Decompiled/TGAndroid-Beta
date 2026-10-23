package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e70 implements RequestDelegate {
    public final int f25905a;
    public final g70 f25906b;

    public e70(g70 g70Var, int i10) {
        this.f25905a = i10;
        this.f25906b = g70Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f25905a) {
            case 0:
                AndroidUtilities.runOnUIThread(new lg(this.f25906b, tL_error, tLObject, 10));
                return;
            default:
                AndroidUtilities.runOnUIThread(new yt(17, this.f25906b, tL_error));
                return;
        }
    }
}
