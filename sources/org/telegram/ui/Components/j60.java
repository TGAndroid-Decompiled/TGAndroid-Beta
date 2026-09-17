package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j60 implements RequestDelegate {
    public final int f25143a;
    public final l60 f25144b;

    public j60(l60 l60Var, int i10) {
        this.f25143a = i10;
        this.f25144b = l60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f25143a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.q(this.f25144b, tL_error, tLObject, 19));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ny(10, this.f25144b, tL_error));
                return;
        }
    }
}
