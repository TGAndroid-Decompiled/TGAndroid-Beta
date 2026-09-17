package org.telegram.messenger;

import java.util.ArrayList;
public final class z9 implements Runnable {
    public final int f19822a;
    public final MessagesController f19823b;
    public final long f19824c;
    public final ArrayList d;

    public z9(MessagesController messagesController, long j3, ArrayList arrayList, int i10) {
        this.f19822a = i10;
        this.f19823b = messagesController;
        this.f19824c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19822a) {
            case 0:
                this.f19823b.lambda$markAllTopicsAsRead$7(this.d, this.f19824c);
                return;
            case 1:
                this.f19823b.lambda$generateJoinMessage$368(this.f19824c, this.d);
                return;
            case 2:
                this.f19823b.lambda$getDifference$354(this.f19824c, this.d);
                return;
            case 3:
                this.f19823b.lambda$processUpdateArray$418(this.f19824c, this.d);
                return;
            case 4:
                this.f19823b.lambda$deleteMessagesByPush$369(this.d, this.f19824c);
                return;
            default:
                this.f19823b.lambda$getDifference$355(this.f19824c, this.d);
                return;
        }
    }

    public z9(MessagesController messagesController, ArrayList arrayList, long j3, int i10) {
        this.f19822a = i10;
        this.f19823b = messagesController;
        this.d = arrayList;
        this.f19824c = j3;
    }
}
