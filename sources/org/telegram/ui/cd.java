package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cd implements RequestDelegate {
    public final int f35942a;
    public final md f35943b;

    public cd(md mdVar, int i10) {
        this.f35942a = i10;
        this.f35943b = mdVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35942a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i0(19, this.f35943b, tLObject));
                return;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new dd(this.f35943b, 3));
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new i0(17, this.f35943b, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new t1(this.f35943b, tL_error, tLObject, 11));
                return;
        }
    }
}
