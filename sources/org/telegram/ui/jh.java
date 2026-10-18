package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jh implements RequestDelegate {
    public final int f38139a;
    public final sn f38140b;
    public final TLRPC.TL_attachMenuBot f38141c;
    public final TLRPC.User d;

    public jh(sn snVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f38139a = i10;
        this.f38140b = snVar;
        this.f38141c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38139a) {
            case 0:
                AndroidUtilities.runOnUIThread(new mh(this.f38140b, this.f38141c, tL_error, this.d));
                return;
            default:
                AndroidUtilities.runOnUIThread(new mh(this.f38140b, tL_error, this.f38141c, this.d));
                return;
        }
    }
}
