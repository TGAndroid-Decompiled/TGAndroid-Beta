package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ke0 implements RequestDelegate {
    public final int f35122a;
    public final me0 f35123b;
    public final String f35124c;
    public final String d;

    public ke0(me0 me0Var, String str, String str2, int i10) {
        this.f35122a = i10;
        this.f35123b = me0Var;
        this.f35124c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35122a) {
            case 0:
                AndroidUtilities.runOnUIThread(new he0(this.f35123b, tL_error, this.f35124c, this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new he0(this.f35123b, tL_error, tLObject, this.f35124c, this.d));
                return;
        }
    }
}
