package org.telegram.messenger;

import java.util.ArrayList;
public final class yb implements Runnable {
    public final int f20155a = 0;
    public final MessagesController f20156b;
    public final long f20157c;
    public final ArrayList d;
    public final long e;

    public yb(MessagesController messagesController, long j10, long j11, ArrayList arrayList) {
        this.f20156b = messagesController;
        this.f20157c = j10;
        this.e = j11;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20155a) {
            case 0:
                this.f20156b.lambda$checkUnreadPollVotesInternal2$434(this.f20157c, this.e, 0, this.d);
                return;
            case 1:
                this.f20156b.lambda$processUpdateArray$422(this.f20157c, this.d, this.e);
                return;
            default:
                this.f20156b.lambda$deleteMessagesByPush$369(this.d, this.f20157c, this.e);
                return;
        }
    }

    public yb(MessagesController messagesController, long j10, ArrayList arrayList, long j11) {
        this.f20156b = messagesController;
        this.f20157c = j10;
        this.d = arrayList;
        this.e = j11;
    }

    public yb(MessagesController messagesController, ArrayList arrayList, long j10, long j11) {
        this.f20156b = messagesController;
        this.d = arrayList;
        this.f20157c = j10;
        this.e = j11;
    }
}
