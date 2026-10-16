package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class z8 implements Runnable {
    public final int f18849a = 0;
    public final long f18850b;
    public final boolean f18851c;
    public final boolean d;
    public final boolean e;
    public final int f18852f;
    public final BaseController h;
    public final Object f18853n;
    public final Object f18854r;

    public z8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j10, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f18851c = z10;
        this.f18853n = arrayList;
        this.f18852f = i10;
        this.f18850b = j10;
        this.d = z11;
        this.f18854r = arrayList2;
        this.e = z12;
    }

    @Override
    public final void run() {
        switch (this.f18849a) {
            case 0:
                boolean z10 = this.e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f18851c, (ArrayList) this.f18853n, this.f18852f, this.f18850b, this.d, (ArrayList) this.f18854r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f18853n, this.f18850b, this.f18851c, this.d, this.e, this.f18852f, (CountDownLatch) this.f18854r);
                return;
        }
    }

    public z8(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j10, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f18853n = chatFullArr;
        this.f18850b = j10;
        this.f18851c = z10;
        this.d = z11;
        this.e = z12;
        this.f18852f = i10;
        this.f18854r = countDownLatch;
    }
}
