package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ke0 implements RequestDelegate {
    public final int f39465a;
    public final me0 f39466b;
    public final String f39467c;
    public final String d;

    public ke0(me0 me0Var, String str, String str2, int i10) {
        this.f39465a = i10;
        this.f39466b = me0Var;
        this.f39467c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39465a) {
            case 0:
                AndroidUtilities.runOnUIThread(new he0(this.f39466b, tL_error, this.f39467c, this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new he0(this.f39466b, tL_error, tLObject, this.f39467c, this.d));
                return;
        }
    }
}
