package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class im0 implements RequestDelegate {
    public final int f37171a;
    public final un0 f37172b;

    public im0(un0 un0Var, int i10) {
        this.f37171a = i10;
        this.f37172b = un0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37171a) {
            case 0:
                AndroidUtilities.runOnUIThread(new uf0(this.f37172b, tL_error, tLObject, 10));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new wc0(29, this.f37172b, tL_error));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new em0(this.f37172b, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new wc0(28, this.f37172b, tLObject));
                return;
        }
    }
}
