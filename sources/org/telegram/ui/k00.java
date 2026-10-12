package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k00 implements RequestDelegate {
    public final int f39307a;
    public final h10 f39308b;

    public k00(h10 h10Var, int i10) {
        this.f39307a = i10;
        this.f39308b = h10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39307a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.y(18, this.f39308b, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new yq(this.f39308b, tL_error, tLObject, 6));
                return;
        }
    }
}
