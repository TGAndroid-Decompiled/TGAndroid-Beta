package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i00 implements RequestDelegate {
    public final int f37202a;
    public final f10 f37203b;

    public i00(f10 f10Var, int i10) {
        this.f37202a = i10;
        this.f37203b = f10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37202a) {
            case 0:
                AndroidUtilities.runOnUIThread(new cu(13, this.f37203b, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new uq(this.f37203b, tL_error, tLObject, 6));
                return;
        }
    }
}
