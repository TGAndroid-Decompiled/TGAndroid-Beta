package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fd implements RequestDelegate {
    public final int f34037a;
    public final pd f34038b;

    public fd(pd pdVar, int i10) {
        this.f34037a = i10;
        this.f34038b = pdVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f34037a) {
            case 0:
                AndroidUtilities.runOnUIThread(new hc(4, this.f34038b, tLObject));
                return;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new gd(this.f34038b, 3));
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new hc(2, this.f34038b, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new u1(this.f34038b, tL_error, tLObject, 11));
                return;
        }
    }
}
