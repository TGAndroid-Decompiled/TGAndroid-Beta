package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class yc implements Utilities.Callback2 {
    public final int f20158a;
    public final MessagesController f20159b;
    public final long f20160c;
    public final Utilities.Callback2 d;

    public yc(MessagesController messagesController, long j10, Utilities.Callback2 callback2, int i10) {
        this.f20158a = i10;
        this.f20159b = messagesController;
        this.f20160c = j10;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f20158a) {
            case 0:
                this.f20159b.lambda$resolveCommunityAllJoinPendingRequests$249(this.f20160c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f20159b.lambda$resolveCommunityJoinPendingRequest$248(this.f20160c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f20159b.lambda$toggleCommunityParticipantBanned$247(this.f20160c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
