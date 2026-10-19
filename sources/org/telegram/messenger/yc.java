package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class yc implements Utilities.Callback2 {
    public final int f20152a;
    public final MessagesController f20153b;
    public final long f20154c;
    public final Utilities.Callback2 d;

    public yc(MessagesController messagesController, long j10, Utilities.Callback2 callback2, int i10) {
        this.f20152a = i10;
        this.f20153b = messagesController;
        this.f20154c = j10;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f20152a) {
            case 0:
                this.f20153b.lambda$resolveCommunityAllJoinPendingRequests$249(this.f20154c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f20153b.lambda$resolveCommunityJoinPendingRequest$248(this.f20154c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f20153b.lambda$toggleCommunityParticipantBanned$247(this.f20154c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
