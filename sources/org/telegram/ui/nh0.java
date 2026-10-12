package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nh0 implements RequestDelegate {
    public final int f38719a;
    public final ei0 f38720b;

    public nh0(ei0 ei0Var, int i10) {
        this.f38719a = i10;
        this.f38720b = ei0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38719a) {
            case 0:
                AndroidUtilities.runOnUIThread(new sh0(this.f38720b, tL_error, tLObject, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new wc0(16, this.f38720b, tL_error));
                return;
        }
    }
}
