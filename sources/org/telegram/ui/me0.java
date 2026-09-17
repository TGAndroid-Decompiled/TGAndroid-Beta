package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class me0 implements RequestDelegate {
    public final int f35770a;
    public final oe0 f35771b;
    public final String f35772c;
    public final String d;

    public me0(oe0 oe0Var, String str, String str2, int i10) {
        this.f35770a = i10;
        this.f35771b = oe0Var;
        this.f35772c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35770a) {
            case 0:
                AndroidUtilities.runOnUIThread(new je0(this.f35771b, tL_error, this.f35772c, this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new je0(this.f35771b, tL_error, tLObject, this.f35772c, this.d));
                return;
        }
    }
}
