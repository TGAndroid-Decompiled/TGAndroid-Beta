package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class po implements RequestDelegate {
    public final int f38979a;
    public final zo f38980b;

    public po(zo zoVar, int i10) {
        this.f38979a = i10;
        this.f38980b = zoVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38979a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t1(this.f38980b, tL_error, tLObject, 27));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ro(this.f38980b, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ro(this.f38980b, 4));
                return;
        }
    }
}
