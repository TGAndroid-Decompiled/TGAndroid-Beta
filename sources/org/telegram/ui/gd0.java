package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gd0 implements RequestDelegate {
    public final int f39589a;
    public final qd0 f39590b;
    public final String f39591c;

    public gd0(qd0 qd0Var, String str, int i10) {
        this.f39589a = i10;
        this.f39590b = qd0Var;
        this.f39591c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39589a) {
            case 0:
                AndroidUtilities.runOnUIThread(new id0(this.f39590b, tL_error, this.f39591c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new id0(this.f39590b, tL_error, tLObject, this.f39591c));
                return;
        }
    }
}
