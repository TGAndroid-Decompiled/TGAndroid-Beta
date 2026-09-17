package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i00 implements RequestDelegate {
    public final int f37174a;
    public final f10 f37175b;

    public i00(f10 f10Var, int i10) {
        this.f37174a = i10;
        this.f37175b = f10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37174a) {
            case 0:
                AndroidUtilities.runOnUIThread(new yt(16, this.f37175b, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new yq(this.f37175b, tL_error, tLObject, 6));
                return;
        }
    }
}
