package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oo implements RequestDelegate {
    public final int f35577a;
    public final yo f35578b;

    public oo(yo yoVar, int i10) {
        this.f35577a = i10;
        this.f35578b = yoVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35577a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s1(this.f35578b, tL_error, tLObject, 27));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new qo(this.f35578b, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new qo(this.f35578b, 4));
                return;
        }
    }
}
