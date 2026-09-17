package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hh0 implements RequestDelegate {
    public final int f37028a;
    public final yh0 f37029b;

    public hh0(yh0 yh0Var, int i10) {
        this.f37028a = i10;
        this.f37029b = yh0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37028a) {
            case 0:
                AndroidUtilities.runOnUIThread(new mh0(this.f37029b, tL_error, tLObject, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new r80(28, this.f37029b, tL_error));
                return;
        }
    }
}
