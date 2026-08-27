package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class jh implements RequestDelegate {

    public final int f39374a;

    public final rn f39375b;

    public final TLRPC.TL_attachMenuBot f39376c;
    public final TLRPC.User d;

    public jh(rn rnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f39374a = i10;
        this.f39375b = rnVar;
        this.f39376c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39374a) {
            case 0:
                AndroidUtilities.runOnUIThread(new mh(this.f39375b, this.f39376c, tL_error, this.d));
                break;
            default:
                AndroidUtilities.runOnUIThread(new mh(this.f39375b, tL_error, this.f39376c, this.d));
                break;
        }
    }
}
