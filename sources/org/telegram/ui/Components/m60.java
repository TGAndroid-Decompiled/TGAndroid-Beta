package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m60 implements RequestDelegate {
    public final int f28946a;
    public final o60 f28947b;

    public m60(o60 o60Var, int i10) {
        this.f28946a = i10;
        this.f28947b = o60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f28946a) {
            case 0:
                AndroidUtilities.runOnUIThread(new jp((Object) this.f28947b, (Object) tL_error, tLObject, 6));
                return;
            default:
                AndroidUtilities.runOnUIThread(new gm(27, this.f28947b, tL_error));
                return;
        }
    }
}
