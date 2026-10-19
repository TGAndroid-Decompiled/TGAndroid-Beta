package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d70 implements RequestDelegate {
    public final int f25435a;
    public final f70 f25436b;

    public d70(f70 f70Var, int i10) {
        this.f25435a = i10;
        this.f25436b = f70Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f25435a) {
            case 0:
                AndroidUtilities.runOnUIThread(new lg(this.f25436b, tL_error, tLObject, 10));
                return;
            default:
                AndroidUtilities.runOnUIThread(new yt(17, this.f25436b, tL_error));
                return;
        }
    }
}
