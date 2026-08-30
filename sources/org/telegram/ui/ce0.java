package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ce0 implements RequestDelegate {
    public final int f33356a;
    public final de0 f33357b;
    public final String f33358c;
    public final String d;

    public ce0(de0 de0Var, String str, String str2, int i10) {
        this.f33356a = i10;
        this.f33357b = de0Var;
        this.f33358c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f33356a) {
            case 0:
                AndroidUtilities.runOnUIThread(new zd0(this.f33357b, tL_error, this.f33358c, this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new zd0(this.f33357b, tL_error, tLObject, this.f33358c, this.d));
                return;
        }
    }
}
