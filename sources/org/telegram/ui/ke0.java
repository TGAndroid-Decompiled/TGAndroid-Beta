package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ke0 implements RequestDelegate {
    public final int f38040a;
    public final me0 f38041b;
    public final String f38042c;
    public final String d;

    public ke0(me0 me0Var, String str, String str2, int i10) {
        this.f38040a = i10;
        this.f38041b = me0Var;
        this.f38042c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38040a) {
            case 0:
                AndroidUtilities.runOnUIThread(new he0(this.f38041b, tL_error, this.f38042c, this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new he0(this.f38041b, tL_error, tLObject, this.f38042c, this.d));
                return;
        }
    }
}
