package org.telegram.messenger;

import java.util.ArrayList;
public final class zb implements Runnable {
    public final int f20290a = 0;
    public final MessagesController f20291b;
    public final long f20292c;
    public final ArrayList d;
    public final long e;

    public zb(MessagesController messagesController, long j10, long j11, ArrayList arrayList) {
        this.f20291b = messagesController;
        this.f20292c = j10;
        this.e = j11;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20290a) {
            case 0:
                this.f20291b.lambda$checkUnreadPollVotesInternal2$434(this.f20292c, this.e, 0, this.d);
                return;
            case 1:
                this.f20291b.lambda$processUpdateArray$422(this.f20292c, this.d, this.e);
                return;
            default:
                this.f20291b.lambda$deleteMessagesByPush$369(this.d, this.f20292c, this.e);
                return;
        }
    }

    public zb(MessagesController messagesController, long j10, ArrayList arrayList, long j11) {
        this.f20291b = messagesController;
        this.f20292c = j10;
        this.d = arrayList;
        this.e = j11;
    }

    public zb(MessagesController messagesController, ArrayList arrayList, long j10, long j11) {
        this.f20291b = messagesController;
        this.d = arrayList;
        this.f20292c = j10;
        this.e = j11;
    }
}
