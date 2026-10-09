package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qh implements RequestDelegate {
    public final int f41115a;
    public final zn f41116b;
    public final TLRPC.TL_attachMenuBot f41117c;
    public final TLRPC.User d;

    public qh(zn znVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f41115a = i10;
        this.f41116b = znVar;
        this.f41117c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41115a) {
            case 0:
                AndroidUtilities.runOnUIThread(new th(this.f41116b, this.f41117c, tL_error, this.d));
                return;
            default:
                AndroidUtilities.runOnUIThread(new th(this.f41116b, tL_error, this.f41117c, this.d));
                return;
        }
    }
}
