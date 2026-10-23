package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hh implements RequestDelegate {
    public final int f37630a;
    public final qn f37631b;
    public final TLRPC.TL_attachMenuBot f37632c;
    public final TLRPC.User d;

    public hh(qn qnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f37630a = i10;
        this.f37631b = qnVar;
        this.f37632c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37630a) {
            case 0:
                AndroidUtilities.runOnUIThread(new kh(this.f37631b, this.f37632c, tL_error, this.d));
                return;
            default:
                AndroidUtilities.runOnUIThread(new kh(this.f37631b, tL_error, this.f37632c, this.d));
                return;
        }
    }
}
