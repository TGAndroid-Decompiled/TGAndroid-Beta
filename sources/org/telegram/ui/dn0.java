package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dn0 implements RequestDelegate {
    public final int f36420a;
    public final eo0 f36421b;

    public dn0(eo0 eo0Var, int i10) {
        this.f36420a = i10;
        this.f36421b = eo0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36420a) {
            case 0:
                AndroidUtilities.runOnUIThread(new xg0(15, this.f36421b, tL_error));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new cn0(this.f36421b, tL_error, tLObject, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new wm0(this.f36421b, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new wm0(this.f36421b, tLObject, 0));
                return;
        }
    }
}
