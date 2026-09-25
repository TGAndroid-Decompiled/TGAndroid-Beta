package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class z7 implements Runnable {
    public final int f18280a;
    public final MediaDataController f18281b;
    public final TLRPC.Document f18282c;

    public z7(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f18280a = i10;
        this.f18281b = mediaDataController;
        this.f18282c = document;
    }

    @Override
    public final void run() {
        switch (this.f18280a) {
            case 0:
                this.f18281b.lambda$removeRecentGif$25(this.f18282c);
                return;
            default:
                this.f18281b.lambda$addRecentGif$26(this.f18282c);
                return;
        }
    }
}
