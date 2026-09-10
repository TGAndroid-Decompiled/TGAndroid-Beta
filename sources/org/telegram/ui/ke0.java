package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ke0 implements RequestDelegate {
    public final int f34344a;
    public final me0 f34345b;
    public final String f34346c;
    public final String d;

    public ke0(me0 me0Var, String str, String str2, int i10) {
        this.f34344a = i10;
        this.f34345b = me0Var;
        this.f34346c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f34344a) {
            case 0:
                AndroidUtilities.runOnUIThread(new he0(this.f34345b, tL_error, this.f34346c, this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new he0(this.f34345b, tL_error, tLObject, this.f34346c, this.d));
                return;
        }
    }
}
