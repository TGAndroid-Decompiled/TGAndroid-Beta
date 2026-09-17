package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ke0 implements RequestDelegate {
    public final int f38067a;
    public final me0 f38068b;
    public final String f38069c;
    public final String d;

    public ke0(me0 me0Var, String str, String str2, int i10) {
        this.f38067a = i10;
        this.f38068b = me0Var;
        this.f38069c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38067a) {
            case 0:
                AndroidUtilities.runOnUIThread(new he0(this.f38068b, tL_error, this.f38069c, this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new he0(this.f38068b, tL_error, tLObject, this.f38069c, this.d));
                return;
        }
    }
}
