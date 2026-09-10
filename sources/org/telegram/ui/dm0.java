package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dm0 implements RequestDelegate {
    public final int f31946a;
    public final on0 f31947b;

    public dm0(on0 on0Var, int i10) {
        this.f31946a = i10;
        this.f31947b = on0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f31946a) {
            case 0:
                AndroidUtilities.runOnUIThread(new pf0(this.f31947b, tL_error, tLObject, 10));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ak0(7, this.f31947b, tL_error));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new yl0(this.f31947b, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ak0(6, this.f31947b, tLObject));
                return;
        }
    }
}
