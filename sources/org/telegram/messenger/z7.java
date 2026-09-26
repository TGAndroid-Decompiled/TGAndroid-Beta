package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class z7 implements Runnable {
    public final int f18279a;
    public final MediaDataController f18280b;
    public final TLRPC.Document f18281c;

    public z7(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f18279a = i10;
        this.f18280b = mediaDataController;
        this.f18281c = document;
    }

    @Override
    public final void run() {
        switch (this.f18279a) {
            case 0:
                this.f18280b.lambda$removeRecentGif$25(this.f18281c);
                return;
            default:
                this.f18280b.lambda$addRecentGif$26(this.f18281c);
                return;
        }
    }
}
