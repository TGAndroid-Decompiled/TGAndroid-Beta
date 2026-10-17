package org.telegram.messenger;

import java.util.ArrayList;
public final class zf implements Runnable {
    public final int f20243a;
    public final MessagesStorage f20244b;
    public final ArrayList f20245c;
    public final ArrayList d;

    public zf(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f20243a = i10;
        this.f20244b = messagesStorage;
        this.f20245c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f20243a) {
            case 0:
                this.f20244b.lambda$setDialogsPinned$252(this.f20245c, this.d);
                return;
            default:
                this.f20244b.lambda$loadTopics$50(this.f20245c, this.d);
                return;
        }
    }
}
