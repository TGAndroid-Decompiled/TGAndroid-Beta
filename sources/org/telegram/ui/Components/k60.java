package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k60 implements RequestDelegate {
    public final int f25523a;
    public final m60 f25524b;

    public k60(m60 m60Var, int i10) {
        this.f25523a = i10;
        this.f25524b = m60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f25523a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(this.f25524b, tL_error, tLObject, 19));
                return;
            default:
                AndroidUtilities.runOnUIThread(new oy(10, this.f25524b, tL_error));
                return;
        }
    }
}
