package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oo implements RequestDelegate {
    public final int f40747a;
    public final xo f40748b;

    public oo(xo xoVar, int i10) {
        this.f40747a = i10;
        this.f40748b = xoVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40747a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r1(this.f40748b, tL_error, tLObject, 27));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new qo(this.f40748b, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new qo(this.f40748b, 4));
                return;
        }
    }
}
