package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ed0 implements RequestDelegate {
    public final int f39085a;
    public final od0 f39086b;
    public final String f39087c;

    public ed0(od0 od0Var, String str, int i10) {
        this.f39085a = i10;
        this.f39086b = od0Var;
        this.f39087c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39085a) {
            case 0:
                AndroidUtilities.runOnUIThread(new gd0(this.f39086b, tL_error, this.f39087c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new gd0(this.f39086b, tL_error, tLObject, this.f39087c));
                return;
        }
    }
}
