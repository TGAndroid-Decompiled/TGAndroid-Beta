package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class y8 implements Runnable {
    public final int f20139a = 0;
    public final long f20140b;
    public final boolean f20141c;
    public final boolean d;
    public final boolean e;
    public final int f20142f;
    public final BaseController h;
    public final Object f20143n;
    public final Object f20144r;

    public y8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j10, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f20141c = z10;
        this.f20143n = arrayList;
        this.f20142f = i10;
        this.f20140b = j10;
        this.d = z11;
        this.f20144r = arrayList2;
        this.e = z12;
    }

    @Override
    public final void run() {
        switch (this.f20139a) {
            case 0:
                boolean z10 = this.e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f20141c, (ArrayList) this.f20143n, this.f20142f, this.f20140b, this.d, (ArrayList) this.f20144r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f20143n, this.f20140b, this.f20141c, this.d, this.e, this.f20142f, (CountDownLatch) this.f20144r);
                return;
        }
    }

    public y8(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j10, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f20143n = chatFullArr;
        this.f20140b = j10;
        this.f20141c = z10;
        this.d = z11;
        this.e = z12;
        this.f20142f = i10;
        this.f20144r = countDownLatch;
    }
}
