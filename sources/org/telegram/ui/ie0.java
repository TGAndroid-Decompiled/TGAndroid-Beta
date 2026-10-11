package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ie0 implements RequestDelegate {
    public final int f38670a;
    public final ke0 f38671b;
    public final String f38672c;
    public final String d;

    public ie0(ke0 ke0Var, String str, String str2, int i10) {
        this.f38670a = i10;
        this.f38671b = ke0Var;
        this.f38672c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38670a) {
            case 0:
                AndroidUtilities.runOnUIThread(new fe0(this.f38671b, tL_error, this.f38672c, this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new fe0(this.f38671b, tL_error, tLObject, this.f38672c, this.d));
                return;
        }
    }
}
