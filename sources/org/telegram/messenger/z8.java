package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class z8 implements Runnable {
    public final int f19147a = 0;
    public final long f19148b;
    public final boolean f19149c;
    public final boolean d;
    public final boolean e;
    public final int f19150f;
    public final BaseController h;
    public final Object f19151n;
    public final Object f19152r;

    public z8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j10, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f19149c = z10;
        this.f19151n = arrayList;
        this.f19150f = i10;
        this.f19148b = j10;
        this.d = z11;
        this.f19152r = arrayList2;
        this.e = z12;
    }

    @Override
    public final void run() {
        switch (this.f19147a) {
            case 0:
                boolean z10 = this.e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f19149c, (ArrayList) this.f19151n, this.f19150f, this.f19148b, this.d, (ArrayList) this.f19152r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f19151n, this.f19148b, this.f19149c, this.d, this.e, this.f19150f, (CountDownLatch) this.f19152r);
                return;
        }
    }

    public z8(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j10, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f19151n = chatFullArr;
        this.f19148b = j10;
        this.f19149c = z10;
        this.d = z11;
        this.e = z12;
        this.f19150f = i10;
        this.f19152r = countDownLatch;
    }
}
