package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ol0 implements RequestDelegate {
    public final int f40228a;
    public final an0 f40229b;

    public ol0(an0 an0Var, int i10) {
        this.f40228a = i10;
        this.f40229b = an0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40228a) {
            case 0:
                AndroidUtilities.runOnUIThread(new re0(this.f40229b, tL_error, tLObject, 12));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new bh0(12, this.f40229b, tL_error));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new kl0(this.f40229b, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new bh0(11, this.f40229b, tLObject));
                return;
        }
    }
}
