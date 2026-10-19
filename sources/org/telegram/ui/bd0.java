package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bd0 implements RequestDelegate {
    public final int f35616a;
    public final md0 f35617b;
    public final String f35618c;

    public bd0(md0 md0Var, String str, int i10) {
        this.f35616a = i10;
        this.f35617b = md0Var;
        this.f35618c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35616a) {
            case 0:
                AndroidUtilities.runOnUIThread(new dd0(this.f35617b, tL_error, this.f35618c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new dd0(this.f35617b, tL_error, tLObject, this.f35618c));
                return;
        }
    }
}
