package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pd0 implements RequestDelegate {
    public final int f39979a;
    public final zd0 f39980b;
    public final String f39981c;

    public pd0(zd0 zd0Var, String str, int i10) {
        this.f39979a = i10;
        this.f39980b = zd0Var;
        this.f39981c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39979a) {
            case 0:
                AndroidUtilities.runOnUIThread(new rd0(this.f39980b, tL_error, this.f39981c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new rd0(this.f39980b, tL_error, tLObject, this.f39981c));
                return;
        }
    }
}
