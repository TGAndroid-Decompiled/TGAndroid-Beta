package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cm0 implements RequestDelegate {
    public final int f36751a;
    public final nn0 f36752b;

    public cm0(nn0 nn0Var, int i10) {
        this.f36751a = i10;
        this.f36752b = nn0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36751a) {
            case 0:
                AndroidUtilities.runOnUIThread(new of0(this.f36752b, tL_error, tLObject, 10));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new tf0(18, this.f36752b, tL_error));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new yl0(this.f36752b, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new tf0(17, this.f36752b, tLObject));
                return;
        }
    }
}
