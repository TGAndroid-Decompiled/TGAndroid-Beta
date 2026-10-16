package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ne0 implements RequestDelegate {
    public final int f38375a;
    public final pe0 f38376b;
    public final String f38377c;
    public final String d;

    public ne0(pe0 pe0Var, String str, String str2, int i10) {
        this.f38375a = i10;
        this.f38376b = pe0Var;
        this.f38377c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38375a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ke0(this.f38376b, tL_error, this.f38377c, this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ke0(this.f38376b, tL_error, tLObject, this.f38377c, this.d));
                return;
        }
    }
}
