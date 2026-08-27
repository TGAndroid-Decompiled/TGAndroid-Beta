package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ao implements RequestDelegate {

    public final int f36579a;

    public final jo f36580b;

    public ao(jo joVar, int i10) {
        this.f36579a = i10;
        this.f36580b = joVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36579a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u1(this.f36580b, tL_error, tLObject, 27));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new co(this.f36580b, 1));
                break;
            default:
                AndroidUtilities.runOnUIThread(new co(this.f36580b, 4));
                break;
        }
    }
}
