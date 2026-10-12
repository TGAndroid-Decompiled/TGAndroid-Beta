package org.telegram.messenger;

import java.util.ArrayList;
public final class z9 implements Runnable {
    public final int f19734a;
    public final MessagesController f19735b;
    public final ArrayList f19736c;
    public final long d;

    public z9(MessagesController messagesController, long j3, ArrayList arrayList, int i10) {
        this.f19734a = i10;
        this.f19735b = messagesController;
        this.d = j3;
        this.f19736c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19734a) {
            case 0:
                this.f19735b.lambda$deleteMessagesByPush$368(this.f19736c, this.d);
                return;
            case 1:
                this.f19735b.lambda$markAllTopicsAsRead$7(this.f19736c, this.d);
                return;
            case 2:
                this.f19735b.lambda$getDifference$353(this.d, this.f19736c);
                return;
            case 3:
                this.f19735b.lambda$generateJoinMessage$367(this.d, this.f19736c);
                return;
            case 4:
                this.f19735b.lambda$processUpdateArray$421(this.d, this.f19736c);
                return;
            default:
                this.f19735b.lambda$getDifference$354(this.d, this.f19736c);
                return;
        }
    }

    public z9(MessagesController messagesController, ArrayList arrayList, long j3, int i10) {
        this.f19734a = i10;
        this.f19735b = messagesController;
        this.f19736c = arrayList;
        this.d = j3;
    }
}
