package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dd implements RequestDelegate {
    public final int f35743a;
    public final nd f35744b;

    public dd(nd ndVar, int i10) {
        this.f35743a = i10;
        this.f35744b = ndVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35743a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.g6(21, this.f35744b, tLObject));
                return;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new ed(this.f35744b, 3));
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.g6(19, this.f35744b, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new r1(this.f35744b, tL_error, tLObject, 11));
                return;
        }
    }
}
