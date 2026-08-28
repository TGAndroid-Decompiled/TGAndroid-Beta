package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ll0 implements RequestDelegate {
    public final int f40189a;
    public final wm0 f40190b;

    public ll0(wm0 wm0Var, int i9) {
        this.f40189a = i9;
        this.f40190b = wm0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40189a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ye0(this.f40190b, tL_error, tLObject, 10));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new cf0(16, this.f40190b, tL_error));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new hl0(this.f40190b, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new cf0(15, this.f40190b, tLObject));
                return;
        }
    }
}
