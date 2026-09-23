package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ph implements RequestDelegate {
    public final int f36111a;
    public final xn f36112b;
    public final TLRPC.TL_attachMenuBot f36113c;
    public final TLRPC.User d;

    public ph(xn xnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f36111a = i10;
        this.f36112b = xnVar;
        this.f36113c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36111a) {
            case 0:
                AndroidUtilities.runOnUIThread(new th(this.f36112b, this.f36113c, tL_error, this.d));
                return;
            default:
                AndroidUtilities.runOnUIThread(new th(this.f36112b, tL_error, this.f36113c, this.d));
                return;
        }
    }
}
