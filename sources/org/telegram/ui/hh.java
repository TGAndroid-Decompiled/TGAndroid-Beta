package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hh implements RequestDelegate {
    public final int f37619a;
    public final qn f37620b;
    public final TLRPC.TL_attachMenuBot f37621c;
    public final TLRPC.User d;

    public hh(qn qnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f37619a = i10;
        this.f37620b = qnVar;
        this.f37621c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37619a) {
            case 0:
                AndroidUtilities.runOnUIThread(new kh(this.f37620b, this.f37621c, tL_error, this.d));
                return;
            default:
                AndroidUtilities.runOnUIThread(new kh(this.f37620b, tL_error, this.f37621c, this.d));
                return;
        }
    }
}
