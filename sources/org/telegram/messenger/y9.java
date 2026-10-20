package org.telegram.messenger;

import java.util.ArrayList;
public final class y9 implements Runnable {
    public final int f20151a;
    public final MessagesController f20152b;
    public final ArrayList f20153c;
    public final long d;

    public y9(MessagesController messagesController, long j10, ArrayList arrayList, int i10) {
        this.f20151a = i10;
        this.f20152b = messagesController;
        this.d = j10;
        this.f20153c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20151a) {
            case 0:
                this.f20152b.lambda$deleteMessagesByPush$368(this.f20153c, this.d);
                return;
            case 1:
                this.f20152b.lambda$markAllTopicsAsRead$7(this.f20153c, this.d);
                return;
            case 2:
                this.f20152b.lambda$getDifference$353(this.d, this.f20153c);
                return;
            case 3:
                this.f20152b.lambda$generateJoinMessage$367(this.d, this.f20153c);
                return;
            case 4:
                this.f20152b.lambda$processUpdateArray$421(this.d, this.f20153c);
                return;
            default:
                this.f20152b.lambda$getDifference$354(this.d, this.f20153c);
                return;
        }
    }

    public y9(MessagesController messagesController, ArrayList arrayList, long j10, int i10) {
        this.f20151a = i10;
        this.f20152b = messagesController;
        this.f20153c = arrayList;
        this.d = j10;
    }
}
