package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class co0 implements RequestDelegate {
    public final int f34989a;
    public final cp0 f34990b;

    public co0(cp0 cp0Var, int i10) {
        this.f34989a = i10;
        this.f34990b = cp0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f34989a) {
            case 0:
                AndroidUtilities.runOnUIThread(new on0(2, this.f34990b, tL_error));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new bo0(this.f34990b, tL_error, tLObject, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new vn0(this.f34990b, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new vn0(this.f34990b, tLObject, 0));
                return;
        }
    }
}
