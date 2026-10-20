package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bd0 implements RequestDelegate {
    public final int f35606a;
    public final md0 f35607b;
    public final String f35608c;

    public bd0(md0 md0Var, String str, int i10) {
        this.f35606a = i10;
        this.f35607b = md0Var;
        this.f35608c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35606a) {
            case 0:
                AndroidUtilities.runOnUIThread(new dd0(this.f35607b, tL_error, this.f35608c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new dd0(this.f35607b, tL_error, tLObject, this.f35608c));
                return;
        }
    }
}
