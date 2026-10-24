package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bo implements RequestDelegate {
    public final int f36115a;
    public final ko f36116b;

    public bo(ko koVar, int i10) {
        this.f36115a = i10;
        this.f36116b = koVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36115a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s1(this.f36116b, tL_error, tLObject, 27));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new eo(this.f36116b, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new eo(this.f36116b, 4));
                return;
        }
    }
}
