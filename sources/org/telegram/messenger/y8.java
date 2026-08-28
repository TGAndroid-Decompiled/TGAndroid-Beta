package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class y8 implements Runnable {
    public final int f22219a = 0;
    public final long f22220b;
    public final boolean f22221c;
    public final boolean d;
    public final boolean f22222e;
    public final int f22223f;
    public final BaseController h;
    public final Object f22224n;
    public final Object f22225r;

    public y8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i9, long j10, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f22221c = z10;
        this.f22224n = arrayList;
        this.f22223f = i9;
        this.f22220b = j10;
        this.d = z11;
        this.f22225r = arrayList2;
        this.f22222e = z12;
    }

    @Override
    public final void run() {
        switch (this.f22219a) {
            case 0:
                boolean z10 = this.f22222e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f22221c, (ArrayList) this.f22224n, this.f22223f, this.f22220b, this.d, (ArrayList) this.f22225r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f22224n, this.f22220b, this.f22221c, this.d, this.f22222e, this.f22223f, (CountDownLatch) this.f22225r);
                return;
        }
    }

    public y8(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j10, boolean z10, boolean z11, boolean z12, int i9, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f22224n = chatFullArr;
        this.f22220b = j10;
        this.f22221c = z10;
        this.d = z11;
        this.f22222e = z12;
        this.f22223f = i9;
        this.f22225r = countDownLatch;
    }
}
