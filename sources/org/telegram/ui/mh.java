package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mh implements RequestDelegate {
    public final int f39155a;
    public final xn f39156b;
    public final TLRPC.TL_attachMenuBot f39157c;
    public final TLRPC.User d;

    public mh(xn xnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f39155a = i10;
        this.f39156b = xnVar;
        this.f39157c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39155a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ph(this.f39156b, this.f39157c, tL_error, this.d));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ph(this.f39156b, tL_error, this.f39157c, this.d));
                return;
        }
    }
}
