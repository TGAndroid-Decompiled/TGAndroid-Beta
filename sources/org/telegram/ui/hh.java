package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hh implements RequestDelegate {
    public final int f37867a;
    public final sn f37868b;
    public final TLRPC.TL_attachMenuBot f37869c;
    public final TLRPC.User d;

    public hh(sn snVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.f37867a = i10;
        this.f37868b = snVar;
        this.f37869c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37867a) {
            case 0:
                AndroidUtilities.runOnUIThread(new kh(this.f37868b, this.f37869c, tL_error, this.d));
                return;
            default:
                AndroidUtilities.runOnUIThread(new kh(this.f37868b, tL_error, this.f37869c, this.d));
                return;
        }
    }
}
