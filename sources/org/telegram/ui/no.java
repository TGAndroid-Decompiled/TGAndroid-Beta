package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class no implements RequestDelegate {
    public final int f38994a;
    public final xo f38995b;

    public no(xo xoVar, int i10) {
        this.f38994a = i10;
        this.f38995b = xoVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38994a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r1(this.f38995b, tL_error, tLObject, 27));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new po(this.f38995b, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new po(this.f38995b, 4));
                return;
        }
    }
}
