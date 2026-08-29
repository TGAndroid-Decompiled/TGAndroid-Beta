package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hh implements RequestDelegate {
    public final int f38909a;
    public final tn f38910b;
    public final TLRPC.TL_attachMenuBot f38911c;
    public final TLRPC.User d;

    public hh(tn tnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f38909a = i10;
        this.f38910b = tnVar;
        this.f38911c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38909a) {
            case 0:
                AndroidUtilities.runOnUIThread(new kh(this.f38910b, this.f38911c, tL_error, this.d));
                return;
            default:
                AndroidUtilities.runOnUIThread(new kh(this.f38910b, tL_error, this.f38911c, this.d));
                return;
        }
    }
}
