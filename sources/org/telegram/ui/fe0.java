package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fe0 implements RequestDelegate {
    public final int f33298a;
    public final he0 f33299b;
    public final String f33300c;
    public final String d;

    public fe0(he0 he0Var, String str, String str2, int i10) {
        this.f33298a = i10;
        this.f33299b = he0Var;
        this.f33300c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f33298a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ce0(this.f33299b, tL_error, this.f33300c, this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ce0(this.f33299b, tL_error, tLObject, this.f33300c, this.d));
                return;
        }
    }
}
