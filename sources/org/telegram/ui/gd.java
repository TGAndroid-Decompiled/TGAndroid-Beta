package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gd implements RequestDelegate {
    public final int f38004a;
    public final qd f38005b;

    public gd(qd qdVar, int i10) {
        this.f38004a = i10;
        this.f38005b = qdVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38004a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.f6(21, this.f38005b, tLObject));
                return;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new hd(this.f38005b, 3));
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.f6(19, this.f38005b, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new r1(this.f38005b, tL_error, tLObject, 11));
                return;
        }
    }
}
