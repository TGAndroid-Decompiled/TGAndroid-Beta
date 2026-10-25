package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kh implements RequestDelegate {
    public final int f40941a;
    public final un f40942b;
    public final TLRPC.TL_attachMenuBot f40943c;
    public final TLRPC.User d;

    public kh(un unVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f40941a = i10;
        this.f40942b = unVar;
        this.f40943c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40941a) {
            case 0:
                AndroidUtilities.runOnUIThread(new nh(this.f40942b, this.f40943c, tL_error, this.d));
                return;
            default:
                AndroidUtilities.runOnUIThread(new nh(this.f40942b, tL_error, this.f40943c, this.d));
                return;
        }
    }
}
