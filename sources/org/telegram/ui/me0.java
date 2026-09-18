package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class me0 implements RequestDelegate {
    public final int f35775a;
    public final oe0 f35776b;
    public final String f35777c;
    public final String d;

    public me0(oe0 oe0Var, String str, String str2, int i10) {
        this.f35775a = i10;
        this.f35776b = oe0Var;
        this.f35777c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35775a) {
            case 0:
                AndroidUtilities.runOnUIThread(new je0(this.f35776b, tL_error, this.f35777c, this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new je0(this.f35776b, tL_error, tLObject, this.f35777c, this.d));
                return;
        }
    }
}
