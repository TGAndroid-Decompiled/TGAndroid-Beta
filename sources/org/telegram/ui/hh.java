package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hh implements RequestDelegate {
    public final int f37625a;
    public final qn f37626b;
    public final TLRPC.TL_attachMenuBot f37627c;
    public final TLRPC.User d;

    public hh(qn qnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f37625a = i10;
        this.f37626b = qnVar;
        this.f37627c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37625a) {
            case 0:
                AndroidUtilities.runOnUIThread(new kh(this.f37626b, this.f37627c, tL_error, this.d));
                return;
            default:
                AndroidUtilities.runOnUIThread(new kh(this.f37626b, tL_error, this.f37627c, this.d));
                return;
        }
    }
}
