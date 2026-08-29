package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dn0 implements RequestDelegate {
    public final int f37565a;
    public final bo0 f37566b;

    public dn0(bo0 bo0Var, int i10) {
        this.f37565a = i10;
        this.f37566b = bo0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37565a) {
            case 0:
                AndroidUtilities.runOnUIThread(new lf0(16, this.f37566b, tL_error));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new cn0(this.f37566b, tL_error, tLObject, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new wm0(this.f37566b, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new wm0(this.f37566b, tLObject, 0));
                return;
        }
    }
}
