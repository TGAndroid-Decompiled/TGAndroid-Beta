package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c70 implements RequestDelegate {
    public final int f25240a;
    public final e70 f25241b;

    public c70(e70 e70Var, int i10) {
        this.f25240a = i10;
        this.f25241b = e70Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f25240a) {
            case 0:
                AndroidUtilities.runOnUIThread(new jg(this.f25241b, tL_error, tLObject, 10));
                return;
            default:
                AndroidUtilities.runOnUIThread(new wt(17, this.f25241b, tL_error));
                return;
        }
    }
}
