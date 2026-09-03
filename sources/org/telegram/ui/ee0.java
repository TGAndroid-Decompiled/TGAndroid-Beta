package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ee0 implements RequestDelegate {
    public final int f33793a;
    public final fe0 f33794b;
    public final String f33795c;
    public final String d;

    public ee0(fe0 fe0Var, String str, String str2, int i10) {
        this.f33793a = i10;
        this.f33794b = fe0Var;
        this.f33795c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f33793a) {
            case 0:
                AndroidUtilities.runOnUIThread(new be0(this.f33794b, tL_error, this.f33795c, this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new be0(this.f33794b, tL_error, tLObject, this.f33795c, this.d));
                return;
        }
    }
}
