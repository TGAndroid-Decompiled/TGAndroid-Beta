package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cd implements RequestDelegate {
    public final int f35943a;
    public final md f35944b;

    public cd(md mdVar, int i10) {
        this.f35943a = i10;
        this.f35944b = mdVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35943a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i0(19, this.f35944b, tLObject));
                return;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new dd(this.f35944b, 3));
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new i0(17, this.f35944b, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new t1(this.f35944b, tL_error, tLObject, 11));
                return;
        }
    }
}
