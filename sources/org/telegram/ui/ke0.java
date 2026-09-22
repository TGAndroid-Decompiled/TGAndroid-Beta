package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ke0 implements RequestDelegate {
    public final int f35133a;
    public final me0 f35134b;
    public final String f35135c;
    public final String d;

    public ke0(me0 me0Var, String str, String str2, int i10) {
        this.f35133a = i10;
        this.f35134b = me0Var;
        this.f35135c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35133a) {
            case 0:
                AndroidUtilities.runOnUIThread(new he0(this.f35134b, tL_error, this.f35135c, this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new he0(this.f35134b, tL_error, tLObject, this.f35135c, this.d));
                return;
        }
    }
}
