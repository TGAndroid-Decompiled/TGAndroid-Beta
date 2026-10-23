package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class in0 implements RequestDelegate {
    public final int f38282a;
    public final io0 f38283b;

    public in0(io0 io0Var, int i10) {
        this.f38282a = i10;
        this.f38283b = io0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38282a) {
            case 0:
                AndroidUtilities.runOnUIThread(new bh0(15, this.f38283b, tL_error));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new hn0(this.f38283b, tL_error, tLObject, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new bn0(this.f38283b, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new bn0(this.f38283b, tLObject, 0));
                return;
        }
    }
}
