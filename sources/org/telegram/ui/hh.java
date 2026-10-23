package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hh implements RequestDelegate {
    public final int f37860a;
    public final sn f37861b;
    public final TLRPC.TL_attachMenuBot f37862c;
    public final TLRPC.User d;

    public hh(sn snVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f37860a = i10;
        this.f37861b = snVar;
        this.f37862c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37860a) {
            case 0:
                AndroidUtilities.runOnUIThread(new kh(this.f37861b, this.f37862c, tL_error, this.d));
                return;
            default:
                AndroidUtilities.runOnUIThread(new kh(this.f37861b, tL_error, this.f37862c, this.d));
                return;
        }
    }
}
