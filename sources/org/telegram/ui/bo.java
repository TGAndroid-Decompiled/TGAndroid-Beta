package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bo implements RequestDelegate {
    public final int f35691a;
    public final ko f35692b;

    public bo(ko koVar, int i10) {
        this.f35691a = i10;
        this.f35692b = koVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35691a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t1(this.f35692b, tL_error, tLObject, 27));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new eo(this.f35692b, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new eo(this.f35692b, 4));
                return;
        }
    }
}
