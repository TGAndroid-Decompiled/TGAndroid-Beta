package org.telegram.messenger;

import java.util.ArrayList;
public final class zf implements Runnable {
    public final int f20244a;
    public final MessagesStorage f20245b;
    public final ArrayList f20246c;
    public final ArrayList d;

    public zf(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f20244a = i10;
        this.f20245b = messagesStorage;
        this.f20246c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f20244a) {
            case 0:
                this.f20245b.lambda$setDialogsPinned$252(this.f20246c, this.d);
                return;
            default:
                this.f20245b.lambda$loadTopics$50(this.f20246c, this.d);
                return;
        }
    }
}
