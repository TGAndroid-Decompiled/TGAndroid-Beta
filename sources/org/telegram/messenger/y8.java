package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class y8 implements Runnable {
    public final int f20145a = 0;
    public final long f20146b;
    public final boolean f20147c;
    public final boolean d;
    public final boolean e;
    public final int f20148f;
    public final BaseController h;
    public final Object f20149n;
    public final Object f20150r;

    public y8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j10, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f20147c = z10;
        this.f20149n = arrayList;
        this.f20148f = i10;
        this.f20146b = j10;
        this.d = z11;
        this.f20150r = arrayList2;
        this.e = z12;
    }

    @Override
    public final void run() {
        switch (this.f20145a) {
            case 0:
                boolean z10 = this.e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f20147c, (ArrayList) this.f20149n, this.f20148f, this.f20146b, this.d, (ArrayList) this.f20150r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f20149n, this.f20146b, this.f20147c, this.d, this.e, this.f20148f, (CountDownLatch) this.f20150r);
                return;
        }
    }

    public y8(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j10, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f20149n = chatFullArr;
        this.f20146b = j10;
        this.f20147c = z10;
        this.d = z11;
        this.e = z12;
        this.f20148f = i10;
        this.f20150r = countDownLatch;
    }
}
