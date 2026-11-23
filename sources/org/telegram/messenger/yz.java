package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yz implements RequestDelegate {
    public final long f28332a;
    public final int f28333b;
    public final d00 f28334c;

    public yz(d00 d00Var, long j3, int i7) {
        this.f28334c = d00Var;
        this.f28332a = j3;
        this.f28333b = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
            d00 d00Var = this.f28334c;
            mp messagesController = d00Var.getMessagesController();
            int i7 = tL_messages_affectedHistory.pts;
            int i10 = tL_messages_affectedHistory.pts_count;
            long j3 = this.f28332a;
            messagesController.S3(i7, i10, j3);
            int i11 = tL_messages_affectedHistory.offset;
            if (i11 > 0) {
                d00Var.c(this.f28333b, i11, j3);
            }
        }
    }
}
