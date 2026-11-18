package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zz implements RequestDelegate {
    public final long f28398a;
    public final int f28399b;
    public final e00 f28400c;

    public zz(e00 e00Var, long j3, int i7) {
        this.f28400c = e00Var;
        this.f28398a = j3;
        this.f28399b = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
            e00 e00Var = this.f28400c;
            mp messagesController = e00Var.getMessagesController();
            int i7 = tL_messages_affectedHistory.pts;
            int i10 = tL_messages_affectedHistory.pts_count;
            long j3 = this.f28398a;
            messagesController.S3(i7, i10, j3);
            int i11 = tL_messages_affectedHistory.offset;
            if (i11 > 0) {
                e00Var.c(this.f28399b, i11, j3);
            }
        }
    }
}
