package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e00 implements RequestDelegate {
    public final int f33832a;
    public final b10 f33833b;

    public e00(b10 b10Var, int i10) {
        this.f33832a = i10;
        this.f33833b = b10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f33832a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k41(28, this.f33833b, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new rq(this.f33833b, tL_error, tLObject, 6));
                return;
        }
    }
}
