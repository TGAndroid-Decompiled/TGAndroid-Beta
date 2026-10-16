package org.telegram.messenger;

import java.util.ArrayList;
public final class z9 implements Runnable {
    public final int f18855a;
    public final MessagesController f18856b;
    public final ArrayList f18857c;
    public final long d;

    public z9(MessagesController messagesController, long j10, ArrayList arrayList, int i10) {
        this.f18855a = i10;
        this.f18856b = messagesController;
        this.d = j10;
        this.f18857c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18855a) {
            case 0:
                this.f18856b.lambda$deleteMessagesByPush$368(this.f18857c, this.d);
                return;
            case 1:
                this.f18856b.lambda$markAllTopicsAsRead$7(this.f18857c, this.d);
                return;
            case 2:
                this.f18856b.lambda$getDifference$353(this.d, this.f18857c);
                return;
            case 3:
                this.f18856b.lambda$generateJoinMessage$367(this.d, this.f18857c);
                return;
            case 4:
                this.f18856b.lambda$processUpdateArray$421(this.d, this.f18857c);
                return;
            default:
                this.f18856b.lambda$getDifference$354(this.d, this.f18857c);
                return;
        }
    }

    public z9(MessagesController messagesController, ArrayList arrayList, long j10, int i10) {
        this.f18855a = i10;
        this.f18856b = messagesController;
        this.f18857c = arrayList;
        this.d = j10;
    }
}
