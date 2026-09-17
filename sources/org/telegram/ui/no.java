package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class no implements RequestDelegate {
    public final int f39022a;
    public final xo f39023b;

    public no(xo xoVar, int i10) {
        this.f39022a = i10;
        this.f39023b = xoVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39022a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r1(this.f39023b, tL_error, tLObject, 27));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new po(this.f39023b, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new po(this.f39023b, 4));
                return;
        }
    }
}
