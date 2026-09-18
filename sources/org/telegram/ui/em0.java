package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class em0 implements RequestDelegate {
    public final int f33446a;
    public final qn0 f33447b;

    public em0(qn0 qn0Var, int i10) {
        this.f33446a = i10;
        this.f33447b = qn0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f33446a) {
            case 0:
                AndroidUtilities.runOnUIThread(new rf0(this.f33447b, tL_error, tLObject, 10));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new pl0(4, this.f33447b, tL_error));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new zl0(this.f33447b, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new pl0(3, this.f33447b, tLObject));
                return;
        }
    }
}
