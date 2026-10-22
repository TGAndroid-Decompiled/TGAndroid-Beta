package org.telegram.messenger;

import java.util.ArrayList;
public final class zb implements Runnable {
    public final int f20226a = 0;
    public final MessagesController f20227b;
    public final long f20228c;
    public final ArrayList d;
    public final long e;

    public zb(MessagesController messagesController, long j10, long j11, ArrayList arrayList) {
        this.f20227b = messagesController;
        this.f20228c = j10;
        this.e = j11;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20226a) {
            case 0:
                this.f20227b.lambda$checkUnreadPollVotesInternal2$434(this.f20228c, this.e, 0, this.d);
                return;
            case 1:
                this.f20227b.lambda$processUpdateArray$422(this.f20228c, this.d, this.e);
                return;
            default:
                this.f20227b.lambda$deleteMessagesByPush$369(this.d, this.f20228c, this.e);
                return;
        }
    }

    public zb(MessagesController messagesController, long j10, ArrayList arrayList, long j11) {
        this.f20227b = messagesController;
        this.f20228c = j10;
        this.d = arrayList;
        this.e = j11;
    }

    public zb(MessagesController messagesController, ArrayList arrayList, long j10, long j11) {
        this.f20227b = messagesController;
        this.d = arrayList;
        this.f20228c = j10;
        this.e = j11;
    }
}
