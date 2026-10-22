package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bd0 implements RequestDelegate {
    public final int f35610a;
    public final md0 f35611b;
    public final String f35612c;

    public bd0(md0 md0Var, String str, int i10) {
        this.f35610a = i10;
        this.f35611b = md0Var;
        this.f35612c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35610a) {
            case 0:
                AndroidUtilities.runOnUIThread(new dd0(this.f35611b, tL_error, this.f35612c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new dd0(this.f35611b, tL_error, tLObject, this.f35612c));
                return;
        }
    }
}
