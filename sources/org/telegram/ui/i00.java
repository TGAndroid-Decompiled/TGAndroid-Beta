package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i00 implements RequestDelegate {
    public final int f38423a;
    public final f10 f38424b;

    public i00(f10 f10Var, int i10) {
        this.f38423a = i10;
        this.f38424b = f10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38423a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ea1(21, this.f38424b, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new vq(this.f38424b, tL_error, tLObject, 6));
                return;
        }
    }
}
