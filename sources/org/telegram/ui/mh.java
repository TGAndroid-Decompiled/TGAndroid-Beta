package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mh implements RequestDelegate {
    public final int f41441a;
    public final wn f41442b;
    public final TLRPC.TL_attachMenuBot f41443c;
    public final TLRPC.User d;

    public mh(wn wnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f41441a = i10;
        this.f41442b = wnVar;
        this.f41443c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41441a) {
            case 0:
                AndroidUtilities.runOnUIThread(new nh(this.f41442b, tL_error, this.f41443c, this.d));
                return;
            default:
                AndroidUtilities.runOnUIThread(new nh(this.f41442b, this.f41443c, tL_error, this.d));
                return;
        }
    }
}
