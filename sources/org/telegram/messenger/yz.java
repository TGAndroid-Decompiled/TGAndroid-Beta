package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yz implements RequestDelegate {
    public final long f26689a;
    public final int f26690b;
    public final c00 f26691c;

    public yz(c00 c00Var, long j10, int i3) {
        this.f26691c = c00Var;
        this.f26689a = j10;
        this.f26690b = i3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
            c00 c00Var = this.f26691c;
            hp messagesController = c00Var.getMessagesController();
            int i3 = tL_messages_affectedHistory.pts;
            int i10 = tL_messages_affectedHistory.pts_count;
            long j10 = this.f26689a;
            messagesController.L3(i3, i10, j10);
            int i11 = tL_messages_affectedHistory.offset;
            if (i11 > 0) {
                c00Var.c(this.f26690b, i11, j10);
            }
        }
    }
}
