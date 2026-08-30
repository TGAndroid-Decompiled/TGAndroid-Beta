package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mh implements RequestDelegate {
    public final int f36304a;
    public final xn f36305b;
    public final TLRPC.TL_attachMenuBot f36306c;
    public final TLRPC.User d;

    public mh(xn xnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f36304a = i10;
        this.f36305b = xnVar;
        this.f36306c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36304a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ph(this.f36305b, this.f36306c, tL_error, this.d));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ph(this.f36305b, tL_error, this.f36306c, this.d));
                return;
        }
    }
}
