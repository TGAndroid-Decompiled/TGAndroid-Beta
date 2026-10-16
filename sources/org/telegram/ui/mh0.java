package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mh0 implements RequestDelegate {
    public final int f38009a;
    public final di0 f38010b;

    public mh0(di0 di0Var, int i10) {
        this.f38009a = i10;
        this.f38010b = di0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38009a) {
            case 0:
                AndroidUtilities.runOnUIThread(new rh0(this.f38010b, tL_error, tLObject, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new se0(11, this.f38010b, tL_error));
                return;
        }
    }
}
