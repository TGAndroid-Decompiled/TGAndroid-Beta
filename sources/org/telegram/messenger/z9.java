package org.telegram.messenger;

import java.util.ArrayList;
public final class z9 implements Runnable {
    public final int f19849a;
    public final MessagesController f19850b;
    public final long f19851c;
    public final ArrayList d;

    public z9(MessagesController messagesController, long j3, ArrayList arrayList, int i10) {
        this.f19849a = i10;
        this.f19850b = messagesController;
        this.f19851c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19849a) {
            case 0:
                this.f19850b.lambda$markAllTopicsAsRead$7(this.d, this.f19851c);
                return;
            case 1:
                this.f19850b.lambda$generateJoinMessage$368(this.f19851c, this.d);
                return;
            case 2:
                this.f19850b.lambda$getDifference$354(this.f19851c, this.d);
                return;
            case 3:
                this.f19850b.lambda$processUpdateArray$418(this.f19851c, this.d);
                return;
            case 4:
                this.f19850b.lambda$deleteMessagesByPush$369(this.d, this.f19851c);
                return;
            default:
                this.f19850b.lambda$getDifference$355(this.f19851c, this.d);
                return;
        }
    }

    public z9(MessagesController messagesController, ArrayList arrayList, long j3, int i10) {
        this.f19849a = i10;
        this.f19850b = messagesController;
        this.d = arrayList;
        this.f19851c = j3;
    }
}
