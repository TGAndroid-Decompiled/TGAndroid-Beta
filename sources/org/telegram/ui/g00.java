package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g00 implements RequestDelegate {
    public final int f34263a;
    public final c10 f34264b;

    public g00(c10 c10Var, int i10) {
        this.f34263a = i10;
        this.f34264b = c10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f34263a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k41(27, this.f34264b, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new tq(this.f34264b, tL_error, tLObject, 6));
                return;
        }
    }
}
