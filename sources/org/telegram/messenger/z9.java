package org.telegram.messenger;

import java.util.ArrayList;
public final class z9 implements Runnable {
    public final int f19153a;
    public final MessagesController f19154b;
    public final ArrayList f19155c;
    public final long d;

    public z9(MessagesController messagesController, long j10, ArrayList arrayList, int i10) {
        this.f19153a = i10;
        this.f19154b = messagesController;
        this.d = j10;
        this.f19155c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19153a) {
            case 0:
                this.f19154b.lambda$deleteMessagesByPush$368(this.f19155c, this.d);
                return;
            case 1:
                this.f19154b.lambda$markAllTopicsAsRead$7(this.f19155c, this.d);
                return;
            case 2:
                this.f19154b.lambda$getDifference$353(this.d, this.f19155c);
                return;
            case 3:
                this.f19154b.lambda$generateJoinMessage$367(this.d, this.f19155c);
                return;
            case 4:
                this.f19154b.lambda$processUpdateArray$421(this.d, this.f19155c);
                return;
            default:
                this.f19154b.lambda$getDifference$354(this.d, this.f19155c);
                return;
        }
    }

    public z9(MessagesController messagesController, ArrayList arrayList, long j10, int i10) {
        this.f19153a = i10;
        this.f19154b = messagesController;
        this.f19155c = arrayList;
        this.d = j10;
    }
}
