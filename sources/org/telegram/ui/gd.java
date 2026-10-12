package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gd implements RequestDelegate {
    public final int f38002a;
    public final qd f38003b;

    public gd(qd qdVar, int i10) {
        this.f38002a = i10;
        this.f38003b = qdVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38002a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.f6(21, this.f38003b, tLObject));
                return;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new hd(this.f38003b, 3));
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.f6(19, this.f38003b, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new r1(this.f38003b, tL_error, tLObject, 11));
                return;
        }
    }
}
