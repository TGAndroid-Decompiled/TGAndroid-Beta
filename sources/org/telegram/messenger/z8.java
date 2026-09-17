package org.telegram.messenger;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class z8 implements Runnable {
    public final int f19842a = 0;
    public final long f19843b;
    public final boolean f19844c;
    public final boolean d;
    public final boolean f19845e;
    public final int f19846f;
    public final BaseController h;
    public final Object f19847n;
    public final Object f19848r;

    public z8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, int i10, long j3, boolean z11, ArrayList arrayList2, boolean z12) {
        this.h = mediaDataController;
        this.f19844c = z10;
        this.f19847n = arrayList;
        this.f19846f = i10;
        this.f19843b = j3;
        this.d = z11;
        this.f19848r = arrayList2;
        this.f19845e = z12;
    }

    @Override
    public final void run() {
        switch (this.f19842a) {
            case 0:
                boolean z10 = this.f19845e;
                ((MediaDataController) this.h).lambda$processLoadedFeaturedStickers$63(this.f19844c, (ArrayList) this.f19847n, this.f19846f, this.f19843b, this.d, (ArrayList) this.f19848r, z10);
                return;
            default:
                ((MessagesStorage) this.h).lambda$loadChatInfo$144((TLRPC.ChatFull[]) this.f19847n, this.f19843b, this.f19844c, this.d, this.f19845e, this.f19846f, (CountDownLatch) this.f19848r);
                return;
        }
    }

    public z8(MessagesStorage messagesStorage, TLRPC.ChatFull[] chatFullArr, long j3, boolean z10, boolean z11, boolean z12, int i10, CountDownLatch countDownLatch) {
        this.h = messagesStorage;
        this.f19847n = chatFullArr;
        this.f19843b = j3;
        this.f19844c = z10;
        this.d = z11;
        this.f19845e = z12;
        this.f19846f = i10;
        this.f19848r = countDownLatch;
    }
}
