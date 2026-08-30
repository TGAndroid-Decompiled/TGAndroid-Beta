package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class od0 implements RequestDelegate {
    public final int f36878a;
    public final yd0 f36879b;
    public final String f36880c;

    public od0(yd0 yd0Var, String str, int i10) {
        this.f36878a = i10;
        this.f36879b = yd0Var;
        this.f36880c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36878a) {
            case 0:
                AndroidUtilities.runOnUIThread(new qd0(this.f36879b, tL_error, this.f36880c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new qd0(this.f36879b, tL_error, tLObject, this.f36880c));
                return;
        }
    }
}
