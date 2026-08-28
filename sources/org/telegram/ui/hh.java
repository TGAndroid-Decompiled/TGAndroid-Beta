package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hh implements RequestDelegate {
    public final int f38788a;
    public final qn f38789b;
    public final TLRPC.TL_attachMenuBot f38790c;
    public final TLRPC.User d;

    public hh(qn qnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i9) {
        this.f38788a = i9;
        this.f38789b = qnVar;
        this.f38790c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38788a) {
            case 0:
                AndroidUtilities.runOnUIThread(new kh(this.f38789b, this.f38790c, tL_error, this.d));
                return;
            default:
                AndroidUtilities.runOnUIThread(new kh(this.f38789b, tL_error, this.f38790c, this.d));
                return;
        }
    }
}
