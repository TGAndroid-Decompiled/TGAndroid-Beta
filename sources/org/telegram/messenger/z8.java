package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class z8 implements Runnable {
    public final int f19727a = 0;
    public final long f19728b;
    public final boolean f19729c;
    public final boolean d;
    public final boolean f19730e;
    public final int f19731f;
    public final BaseController h;
    public final Object f19732n;
    public final Object f19733r;

    public z8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f19729c = z10;
        this.f19732n = arrayList;
        this.f19731f = i10;
        this.f19728b = j3;
        this.d = z11;
        this.f19733r = arrayList2;
        this.f19730e = z12;
    }

    @Override
    public final void run() {
        switch (this.f19727a) {
            case 0:
                boolean z10 = this.f19730e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f19729c, (ArrayList) this.f19732n, this.f19731f, this.f19728b, this.d, (ArrayList) this.f19733r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f19732n, this.f19728b, this.f19729c, this.d, this.f19730e, this.f19731f, (CountDownLatch) this.f19733r);
                return;
        }
    }

    public z8(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j3, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f19732n = chatFullArr;
        this.f19728b = j3;
        this.f19729c = z10;
        this.d = z11;
        this.f19730e = z12;
        this.f19731f = i10;
        this.f19733r = countDownLatch;
    }
}
