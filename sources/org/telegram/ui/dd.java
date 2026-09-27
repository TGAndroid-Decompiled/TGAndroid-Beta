package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dd implements RequestDelegate {
    public final int f32935a;
    public final nd f32936b;

    public dd(nd ndVar, int i10) {
        this.f32935a = i10;
        this.f32936b = ndVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f32935a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n(20, this.f32936b, tLObject));
                return;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new ed(this.f32936b, 3));
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new n(18, this.f32936b, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new s1(this.f32936b, tL_error, tLObject, 11));
                return;
        }
    }
}
