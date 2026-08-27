package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class fn0 implements RequestDelegate {

    public final int f38171a;

    public final do0 f38172b;

    public fn0(do0 do0Var, int i10) {
        this.f38171a = i10;
        this.f38172b = do0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38171a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ff0(19, this.f38172b, tL_error));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new en0(this.f38172b, tL_error, tLObject, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ym0(this.f38172b, tLObject, 2));
                break;
            default:
                AndroidUtilities.runOnUIThread(new ym0(this.f38172b, tLObject, 0));
                break;
        }
    }
}
