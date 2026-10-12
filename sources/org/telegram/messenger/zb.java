package org.telegram.messenger;

import java.util.ArrayList;
public final class zb implements Runnable {
    public final int f19743a = 0;
    public final MessagesController f19744b;
    public final long f19745c;
    public final ArrayList d;
    public final long f19746e;

    public zb(MessagesController messagesController, long j3, long j10, ArrayList arrayList) {
        this.f19744b = messagesController;
        this.f19745c = j3;
        this.f19746e = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19743a) {
            case 0:
                this.f19744b.lambda$checkUnreadPollVotesInternal2$434(this.f19745c, this.f19746e, 0, this.d);
                return;
            case 1:
                this.f19744b.lambda$processUpdateArray$422(this.f19745c, this.d, this.f19746e);
                return;
            default:
                this.f19744b.lambda$deleteMessagesByPush$369(this.d, this.f19745c, this.f19746e);
                return;
        }
    }

    public zb(MessagesController messagesController, long j3, ArrayList arrayList, long j10) {
        this.f19744b = messagesController;
        this.f19745c = j3;
        this.d = arrayList;
        this.f19746e = j10;
    }

    public zb(MessagesController messagesController, ArrayList arrayList, long j3, long j10) {
        this.f19744b = messagesController;
        this.d = arrayList;
        this.f19745c = j3;
        this.f19746e = j10;
    }
}
