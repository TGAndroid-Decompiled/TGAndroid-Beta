package org.telegram.messenger;

import java.util.ArrayList;
public final class zb implements Runnable {
    public final int f18862a = 0;
    public final MessagesController f18863b;
    public final long f18864c;
    public final ArrayList d;
    public final long e;

    public zb(MessagesController messagesController, long j10, long j11, ArrayList arrayList) {
        this.f18863b = messagesController;
        this.f18864c = j10;
        this.e = j11;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18862a) {
            case 0:
                this.f18863b.lambda$checkUnreadPollVotesInternal2$434(this.f18864c, this.e, 0, this.d);
                return;
            case 1:
                this.f18863b.lambda$processUpdateArray$422(this.f18864c, this.d, this.e);
                return;
            default:
                this.f18863b.lambda$deleteMessagesByPush$369(this.d, this.f18864c, this.e);
                return;
        }
    }

    public zb(MessagesController messagesController, long j10, ArrayList arrayList, long j11) {
        this.f18863b = messagesController;
        this.f18864c = j10;
        this.d = arrayList;
        this.e = j11;
    }

    public zb(MessagesController messagesController, ArrayList arrayList, long j10, long j11) {
        this.f18863b = messagesController;
        this.d = arrayList;
        this.f18864c = j10;
        this.e = j11;
    }
}
