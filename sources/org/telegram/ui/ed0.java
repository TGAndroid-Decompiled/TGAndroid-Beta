package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ed0 implements RequestDelegate {
    public final int f37909a;
    public final pd0 f37910b;
    public final String f37911c;

    public ed0(pd0 pd0Var, String str, int i9) {
        this.f37909a = i9;
        this.f37910b = pd0Var;
        this.f37911c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37909a) {
            case 0:
                AndroidUtilities.runOnUIThread(new gd0(this.f37910b, tL_error, this.f37911c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new gd0(this.f37910b, tL_error, tLObject, this.f37911c));
                return;
        }
    }
}
