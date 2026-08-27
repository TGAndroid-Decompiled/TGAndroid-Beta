package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class x50 implements RequestDelegate {

    public final int f34503a;

    public final z50 f34504b;

    public x50(z50 z50Var, int i10) {
        this.f34503a = i10;
        this.f34504b = z50Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f34503a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.i3(this.f34504b, tL_error, tLObject, 18));
                break;
            default:
                AndroidUtilities.runOnUIThread(new xq(22, this.f34504b, tL_error));
                break;
        }
    }
}
