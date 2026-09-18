package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class le0 implements RequestDelegate {
    public final int f35358a;
    public final ne0 f35359b;
    public final String f35360c;
    public final String d;

    public le0(ne0 ne0Var, String str, String str2, int i10) {
        this.f35358a = i10;
        this.f35359b = ne0Var;
        this.f35360c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35358a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ie0(this.f35359b, tL_error, this.f35360c, this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ie0(this.f35359b, tL_error, tLObject, this.f35360c, this.d));
                return;
        }
    }
}
