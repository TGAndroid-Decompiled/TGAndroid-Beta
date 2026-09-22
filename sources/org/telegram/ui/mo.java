package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mo implements RequestDelegate {
    public final int f35783a;
    public final wo f35784b;

    public mo(wo woVar, int i10) {
        this.f35783a = i10;
        this.f35784b = woVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35783a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q1(this.f35784b, tL_error, tLObject, 27));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new oo(this.f35784b, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new oo(this.f35784b, 4));
                return;
        }
    }
}
