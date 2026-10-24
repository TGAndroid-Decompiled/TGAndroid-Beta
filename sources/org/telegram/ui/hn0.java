package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hn0 implements RequestDelegate {
    public final int f37907a;
    public final ho0 f37908b;

    public hn0(ho0 ho0Var, int i10) {
        this.f37907a = i10;
        this.f37908b = ho0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37907a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ah0(15, this.f37908b, tL_error));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new gn0(this.f37908b, tL_error, tLObject, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new an0(this.f37908b, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new an0(this.f37908b, tLObject, 0));
                return;
        }
    }
}
