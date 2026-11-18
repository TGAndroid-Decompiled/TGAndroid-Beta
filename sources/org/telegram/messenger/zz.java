package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zz implements RequestDelegate {
    public final long f28396a;
    public final int f28397b;
    public final e00 f28398c;

    public zz(e00 e00Var, long j3, int i7) {
        this.f28398c = e00Var;
        this.f28396a = j3;
        this.f28397b = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
            e00 e00Var = this.f28398c;
            mp messagesController = e00Var.getMessagesController();
            int i7 = tL_messages_affectedHistory.pts;
            int i10 = tL_messages_affectedHistory.pts_count;
            long j3 = this.f28396a;
            messagesController.S3(i7, i10, j3);
            int i11 = tL_messages_affectedHistory.offset;
            if (i11 > 0) {
                e00Var.c(this.f28397b, i11, j3);
            }
        }
    }
}
