package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dd implements RequestDelegate {
    public final int f38838a;
    public final nd f38839b;

    public dd(nd ndVar, int i10) {
        this.f38838a = i10;
        this.f38839b = ndVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38838a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ed(0, this.f38839b, tLObject));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.m0(28, this.f38839b, tL_error));
                return;
            case 2:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new cd(this.f38839b, 3));
                    return;
                }
                return;
            default:
                AndroidUtilities.runOnUIThread(new q1(this.f38839b, tL_error, tLObject, 11));
                return;
        }
    }
}
