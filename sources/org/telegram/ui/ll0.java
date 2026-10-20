package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ll0 implements RequestDelegate {
    public final int f38949a;
    public final vm0 f38950b;

    public ll0(vm0 vm0Var, int i10) {
        this.f38949a = i10;
        this.f38950b = vm0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38949a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ve0(this.f38950b, tL_error, tLObject, 11));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new xg0(12, this.f38950b, tL_error));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new hl0(this.f38950b, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new xg0(11, this.f38950b, tLObject));
                return;
        }
    }
}
