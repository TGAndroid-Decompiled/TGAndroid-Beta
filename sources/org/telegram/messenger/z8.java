package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class z8 implements Runnable {
    public final int f19815a = 0;
    public final long f19816b;
    public final boolean f19817c;
    public final boolean d;
    public final boolean f19818e;
    public final int f19819f;
    public final BaseController h;
    public final Object f19820n;
    public final Object f19821r;

    public z8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f19817c = z10;
        this.f19820n = arrayList;
        this.f19819f = i10;
        this.f19816b = j3;
        this.d = z11;
        this.f19821r = arrayList2;
        this.f19818e = z12;
    }

    @Override
    public final void run() {
        switch (this.f19815a) {
            case 0:
                boolean z10 = this.f19818e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f19817c, (ArrayList) this.f19820n, this.f19819f, this.f19816b, this.d, (ArrayList) this.f19821r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f19820n, this.f19816b, this.f19817c, this.d, this.f19818e, this.f19819f, (CountDownLatch) this.f19821r);
                return;
        }
    }

    public z8(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j3, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f19820n = chatFullArr;
        this.f19816b = j3;
        this.f19817c = z10;
        this.d = z11;
        this.f19818e = z12;
        this.f19819f = i10;
        this.f19821r = countDownLatch;
    }
}
