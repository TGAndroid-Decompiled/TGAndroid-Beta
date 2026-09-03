package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mh implements RequestDelegate {
    public final int f38977a;
    public final xn f38978b;
    public final TLRPC.TL_attachMenuBot f38979c;
    public final TLRPC.User d;

    public mh(xn xnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f38977a = i10;
        this.f38978b = xnVar;
        this.f38979c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38977a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ph(this.f38978b, this.f38979c, tL_error, this.d));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ph(this.f38978b, tL_error, this.f38979c, this.d));
                return;
        }
    }
}
