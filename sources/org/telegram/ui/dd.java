package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dd implements RequestDelegate {
    public final int f36198a;
    public final nd f36199b;

    public dd(nd ndVar, int i10) {
        this.f36198a = i10;
        this.f36199b = ndVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36198a) {
            case 0:
                AndroidUtilities.runOnUIThread(new fc(4, this.f36199b, tLObject));
                return;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new ed(this.f36199b, 3));
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new fc(2, this.f36199b, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new s1(this.f36199b, tL_error, tLObject, 11));
                return;
        }
    }
}
