package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class zc implements Utilities.Callback2 {
    public final int f20230a;
    public final MessagesController f20231b;
    public final long f20232c;
    public final Utilities.Callback2 d;

    public zc(MessagesController messagesController, long j10, Utilities.Callback2 callback2, int i10) {
        this.f20230a = i10;
        this.f20231b = messagesController;
        this.f20232c = j10;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f20230a) {
            case 0:
                this.f20231b.lambda$resolveCommunityAllJoinPendingRequests$249(this.f20232c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f20231b.lambda$resolveCommunityJoinPendingRequest$248(this.f20232c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f20231b.lambda$toggleCommunityParticipantBanned$247(this.f20232c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
