package org.telegram.messenger;

import java.util.ArrayList;
public final class zf implements Runnable {
    public final int f20250a;
    public final MessagesStorage f20251b;
    public final ArrayList f20252c;
    public final ArrayList d;

    public zf(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f20250a = i10;
        this.f20251b = messagesStorage;
        this.f20252c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f20250a) {
            case 0:
                this.f20251b.lambda$setDialogsPinned$252(this.f20252c, this.d);
                return;
            default:
                this.f20251b.lambda$loadTopics$50(this.f20252c, this.d);
                return;
        }
    }
}
