package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class io implements RequestDelegate {
    public final int f34507a;
    public final so f34508b;

    public io(so soVar, int i10) {
        this.f34507a = i10;
        this.f34508b = soVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f34507a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s1(this.f34508b, tL_error, tLObject, 27));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ko(this.f34508b, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ko(this.f34508b, 4));
                return;
        }
    }
}
