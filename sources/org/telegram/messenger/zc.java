package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class zc implements Utilities.Callback2 {
    public final int f20227a;
    public final MessagesController f20228b;
    public final long f20229c;
    public final Utilities.Callback2 d;

    public zc(MessagesController messagesController, long j10, Utilities.Callback2 callback2, int i10) {
        this.f20227a = i10;
        this.f20228b = messagesController;
        this.f20229c = j10;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f20227a) {
            case 0:
                this.f20228b.lambda$resolveCommunityAllJoinPendingRequests$249(this.f20229c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f20228b.lambda$resolveCommunityJoinPendingRequest$248(this.f20229c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f20228b.lambda$toggleCommunityParticipantBanned$247(this.f20229c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
