package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ll0 implements RequestDelegate {

    public final int f40154a;

    public final xm0 f40155b;

    public ll0(xm0 xm0Var, int i10) {
        this.f40154a = i10;
        this.f40155b = xm0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40154a) {
            case 0:
                AndroidUtilities.runOnUIThread(new bf0(this.f40155b, tL_error, tLObject, 10));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ff0(16, this.f40155b, tL_error));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new hl0(this.f40155b, 5));
                break;
            default:
                AndroidUtilities.runOnUIThread(new ff0(15, this.f40155b, tLObject));
                break;
        }
    }
}
