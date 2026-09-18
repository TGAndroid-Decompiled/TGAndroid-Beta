package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dm0 implements RequestDelegate {
    public final int f33053a;
    public final pn0 f33054b;

    public dm0(pn0 pn0Var, int i10) {
        this.f33053a = i10;
        this.f33054b = pn0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f33053a) {
            case 0:
                AndroidUtilities.runOnUIThread(new qf0(this.f33054b, tL_error, tLObject, 10));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ak0(8, this.f33054b, tL_error));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new zl0(this.f33054b, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ak0(7, this.f33054b, tLObject));
                return;
        }
    }
}
