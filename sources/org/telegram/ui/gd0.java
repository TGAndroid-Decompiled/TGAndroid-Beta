package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gd0 implements RequestDelegate {
    public final int f37540a;
    public final qd0 f37541b;
    public final String f37542c;

    public gd0(qd0 qd0Var, String str, int i10) {
        this.f37540a = i10;
        this.f37541b = qd0Var;
        this.f37542c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37540a) {
            case 0:
                AndroidUtilities.runOnUIThread(new id0(this.f37541b, tL_error, this.f37542c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new id0(this.f37541b, tL_error, tLObject, this.f37542c));
                return;
        }
    }
}
