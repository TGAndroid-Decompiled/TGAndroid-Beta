package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f00 implements RequestDelegate {
    public final int f36716a;
    public final b10 f36717b;

    public f00(b10 b10Var, int i10) {
        this.f36716a = i10;
        this.f36717b = b10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36716a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l41(27, this.f36717b, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new sq(this.f36717b, tL_error, tLObject, 6));
                return;
        }
    }
}
