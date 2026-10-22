package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ll0 implements RequestDelegate {
    public final int f38953a;
    public final vm0 f38954b;

    public ll0(vm0 vm0Var, int i10) {
        this.f38953a = i10;
        this.f38954b = vm0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38953a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ve0(this.f38954b, tL_error, tLObject, 11));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new xg0(12, this.f38954b, tL_error));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new hl0(this.f38954b, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new xg0(11, this.f38954b, tLObject));
                return;
        }
    }
}
