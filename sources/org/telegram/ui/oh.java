package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oh implements RequestDelegate {
    public final int f36808a;
    public final zn f36809b;
    public final TLRPC.TL_attachMenuBot f36810c;
    public final TLRPC.User d;

    public oh(zn znVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f36808a = i10;
        this.f36809b = znVar;
        this.f36810c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36808a) {
            case 0:
                AndroidUtilities.runOnUIThread(new rh(this.f36809b, this.f36810c, tL_error, this.d));
                return;
            default:
                AndroidUtilities.runOnUIThread(new rh(this.f36809b, tL_error, this.f36810c, this.d));
                return;
        }
    }
}
