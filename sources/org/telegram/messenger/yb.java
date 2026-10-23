package org.telegram.messenger;

import java.util.ArrayList;
public final class yb implements Runnable {
    public final int f20218a = 0;
    public final MessagesController f20219b;
    public final long f20220c;
    public final ArrayList d;
    public final long e;

    public yb(MessagesController messagesController, long j10, long j11, ArrayList arrayList) {
        this.f20219b = messagesController;
        this.f20220c = j10;
        this.e = j11;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20218a) {
            case 0:
                this.f20219b.lambda$checkUnreadPollVotesInternal2$434(this.f20220c, this.e, 0, this.d);
                return;
            case 1:
                this.f20219b.lambda$processUpdateArray$422(this.f20220c, this.d, this.e);
                return;
            default:
                this.f20219b.lambda$deleteMessagesByPush$369(this.d, this.f20220c, this.e);
                return;
        }
    }

    public yb(MessagesController messagesController, long j10, ArrayList arrayList, long j11) {
        this.f20219b = messagesController;
        this.f20220c = j10;
        this.d = arrayList;
        this.e = j11;
    }

    public yb(MessagesController messagesController, ArrayList arrayList, long j10, long j11) {
        this.f20219b = messagesController;
        this.d = arrayList;
        this.f20220c = j10;
        this.e = j11;
    }
}
