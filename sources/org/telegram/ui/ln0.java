package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ln0 implements RequestDelegate {
    public final int f36112a;
    public final jo0 f36113b;

    public ln0(jo0 jo0Var, int i10) {
        this.f36112a = i10;
        this.f36113b = jo0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36112a) {
            case 0:
                AndroidUtilities.runOnUIThread(new fe0(25, this.f36113b, tL_error));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new kn0(this.f36113b, tL_error, tLObject, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new en0(this.f36113b, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new en0(this.f36113b, tLObject, 0));
                return;
        }
    }
}
