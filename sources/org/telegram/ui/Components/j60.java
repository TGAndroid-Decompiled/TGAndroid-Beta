package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j60 implements RequestDelegate {
    public final int f27359a;
    public final l60 f27360b;

    public j60(l60 l60Var, int i10) {
        this.f27359a = i10;
        this.f27360b = l60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27359a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(this.f27360b, tL_error, tLObject, 19));
                return;
            default:
                AndroidUtilities.runOnUIThread(new zu(16, this.f27360b, tL_error));
                return;
        }
    }
}
