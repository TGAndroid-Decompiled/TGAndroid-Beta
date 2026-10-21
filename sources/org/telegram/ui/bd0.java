package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bd0 implements RequestDelegate {
    public final int f35607a;
    public final md0 f35608b;
    public final String f35609c;

    public bd0(md0 md0Var, String str, int i10) {
        this.f35607a = i10;
        this.f35608b = md0Var;
        this.f35609c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35607a) {
            case 0:
                AndroidUtilities.runOnUIThread(new dd0(this.f35608b, tL_error, this.f35609c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new dd0(this.f35608b, tL_error, tLObject, this.f35609c));
                return;
        }
    }
}
