package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class em0 implements RequestDelegate {
    public final int f36159a;
    public final pn0 f36160b;

    public em0(pn0 pn0Var, int i10) {
        this.f36159a = i10;
        this.f36160b = pn0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36159a) {
            case 0:
                AndroidUtilities.runOnUIThread(new pf0(this.f36160b, tL_error, tLObject, 10));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ej0(10, this.f36160b, tL_error));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new zl0(this.f36160b, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ej0(9, this.f36160b, tLObject));
                return;
        }
    }
}
