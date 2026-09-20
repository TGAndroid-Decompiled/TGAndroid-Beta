package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dm0 implements RequestDelegate {
    public final int f33104a;
    public final pn0 f33105b;

    public dm0(pn0 pn0Var, int i10) {
        this.f33104a = i10;
        this.f33105b = pn0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f33104a) {
            case 0:
                AndroidUtilities.runOnUIThread(new rf0(this.f33105b, tL_error, tLObject, 10));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new fj0(10, this.f33105b, tL_error));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new zl0(this.f33105b, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new fj0(9, this.f33105b, tLObject));
                return;
        }
    }
}
