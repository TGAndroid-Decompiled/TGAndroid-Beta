package org.telegram.messenger;

import java.util.ArrayList;
public final class zb implements Runnable {
    public final int f19160a = 0;
    public final MessagesController f19161b;
    public final long f19162c;
    public final ArrayList d;
    public final long e;

    public zb(MessagesController messagesController, long j10, long j11, ArrayList arrayList) {
        this.f19161b = messagesController;
        this.f19162c = j10;
        this.e = j11;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19160a) {
            case 0:
                this.f19161b.lambda$checkUnreadPollVotesInternal2$434(this.f19162c, this.e, 0, this.d);
                return;
            case 1:
                this.f19161b.lambda$processUpdateArray$422(this.f19162c, this.d, this.e);
                return;
            default:
                this.f19161b.lambda$deleteMessagesByPush$369(this.d, this.f19162c, this.e);
                return;
        }
    }

    public zb(MessagesController messagesController, long j10, ArrayList arrayList, long j11) {
        this.f19161b = messagesController;
        this.f19162c = j10;
        this.d = arrayList;
        this.e = j11;
    }

    public zb(MessagesController messagesController, ArrayList arrayList, long j10, long j11) {
        this.f19161b = messagesController;
        this.d = arrayList;
        this.f19162c = j10;
        this.e = j11;
    }
}
