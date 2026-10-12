package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class po implements RequestDelegate {
    public final int f39267a;
    public final zo f39268b;

    public po(zo zoVar, int i10) {
        this.f39267a = i10;
        this.f39268b = zoVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39267a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t1(this.f39268b, tL_error, tLObject, 27));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ro(this.f39268b, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ro(this.f39268b, 4));
                return;
        }
    }
}
