package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class em0 implements RequestDelegate {
    public final int f37187a;
    public final pn0 f37188b;

    public em0(pn0 pn0Var, int i10) {
        this.f37187a = i10;
        this.f37188b = pn0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37187a) {
            case 0:
                AndroidUtilities.runOnUIThread(new pf0(this.f37188b, tL_error, tLObject, 10));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new cg0(16, this.f37188b, tL_error));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new zl0(this.f37188b, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new cg0(15, this.f37188b, tLObject));
                return;
        }
    }
}
