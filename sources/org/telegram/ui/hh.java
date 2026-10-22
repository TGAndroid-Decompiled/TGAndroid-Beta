package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hh implements RequestDelegate {
    public final int f37629a;
    public final qn f37630b;
    public final TLRPC.TL_attachMenuBot f37631c;
    public final TLRPC.User d;

    public hh(qn qnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f37629a = i10;
        this.f37630b = qnVar;
        this.f37631c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37629a) {
            case 0:
                AndroidUtilities.runOnUIThread(new kh(this.f37630b, this.f37631c, tL_error, this.d));
                return;
            default:
                AndroidUtilities.runOnUIThread(new kh(this.f37630b, tL_error, this.f37631c, this.d));
                return;
        }
    }
}
