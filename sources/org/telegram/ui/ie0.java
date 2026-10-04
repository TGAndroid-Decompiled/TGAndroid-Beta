package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ie0 implements RequestDelegate {
    public final int f37409a;
    public final ke0 f37410b;
    public final String f37411c;
    public final String d;

    public ie0(ke0 ke0Var, String str, String str2, int i10) {
        this.f37409a = i10;
        this.f37410b = ke0Var;
        this.f37411c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37409a) {
            case 0:
                AndroidUtilities.runOnUIThread(new fe0(this.f37410b, tL_error, this.f37411c, this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new fe0(this.f37410b, tL_error, tLObject, this.f37411c, this.d));
                return;
        }
    }
}
