package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oo implements RequestDelegate {
    public final int f40749a;
    public final xo f40750b;

    public oo(xo xoVar, int i10) {
        this.f40749a = i10;
        this.f40750b = xoVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40749a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r1(this.f40750b, tL_error, tLObject, 27));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new qo(this.f40750b, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new qo(this.f40750b, 4));
                return;
        }
    }
}
