package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class z8 implements Runnable {
    public final int f19728a = 0;
    public final long f19729b;
    public final boolean f19730c;
    public final boolean d;
    public final boolean f19731e;
    public final int f19732f;
    public final BaseController h;
    public final Object f19733n;
    public final Object f19734r;

    public z8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f19730c = z10;
        this.f19733n = arrayList;
        this.f19732f = i10;
        this.f19729b = j3;
        this.d = z11;
        this.f19734r = arrayList2;
        this.f19731e = z12;
    }

    @Override
    public final void run() {
        switch (this.f19728a) {
            case 0:
                boolean z10 = this.f19731e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f19730c, (ArrayList) this.f19733n, this.f19732f, this.f19729b, this.d, (ArrayList) this.f19734r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f19733n, this.f19729b, this.f19730c, this.d, this.f19731e, this.f19732f, (CountDownLatch) this.f19734r);
                return;
        }
    }

    public z8(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j3, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f19733n = chatFullArr;
        this.f19729b = j3;
        this.f19730c = z10;
        this.d = z11;
        this.f19731e = z12;
        this.f19732f = i10;
        this.f19734r = countDownLatch;
    }
}
