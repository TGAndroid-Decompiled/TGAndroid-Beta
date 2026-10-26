package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kh implements RequestDelegate {
    public final int f40944a;
    public final un f40945b;
    public final TLRPC.TL_attachMenuBot f40946c;
    public final TLRPC.User d;

    public kh(un unVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f40944a = i10;
        this.f40945b = unVar;
        this.f40946c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40944a) {
            case 0:
                AndroidUtilities.runOnUIThread(new nh(this.f40945b, this.f40946c, tL_error, this.d));
                return;
            default:
                AndroidUtilities.runOnUIThread(new nh(this.f40945b, tL_error, this.f40946c, this.d));
                return;
        }
    }
}
