package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n00 implements RequestDelegate {
    public final int f38103a;
    public final k10 f38104b;

    public n00(k10 k10Var, int i10) {
        this.f38103a = i10;
        this.f38104b = k10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38103a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.n51(27, this.f38104b, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new br(this.f38104b, tL_error, tLObject, 6));
                return;
        }
    }
}
