package org.telegram.messenger;

import java.util.ArrayList;
public final class zb implements Runnable {
    public final int f19742a = 0;
    public final MessagesController f19743b;
    public final long f19744c;
    public final ArrayList d;
    public final long f19745e;

    public zb(MessagesController messagesController, long j3, long j10, ArrayList arrayList) {
        this.f19743b = messagesController;
        this.f19744c = j3;
        this.f19745e = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19742a) {
            case 0:
                this.f19743b.lambda$checkUnreadPollVotesInternal2$434(this.f19744c, this.f19745e, 0, this.d);
                return;
            case 1:
                this.f19743b.lambda$processUpdateArray$422(this.f19744c, this.d, this.f19745e);
                return;
            default:
                this.f19743b.lambda$deleteMessagesByPush$369(this.d, this.f19744c, this.f19745e);
                return;
        }
    }

    public zb(MessagesController messagesController, long j3, ArrayList arrayList, long j10) {
        this.f19743b = messagesController;
        this.f19744c = j3;
        this.d = arrayList;
        this.f19745e = j10;
    }

    public zb(MessagesController messagesController, ArrayList arrayList, long j3, long j10) {
        this.f19743b = messagesController;
        this.d = arrayList;
        this.f19744c = j3;
        this.f19745e = j10;
    }
}
