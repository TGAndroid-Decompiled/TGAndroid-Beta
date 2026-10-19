package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class z7 implements Runnable {
    public final int f20205a;
    public final MediaDataController f20206b;
    public final TLRPC.Document f20207c;

    public z7(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f20205a = i10;
        this.f20206b = mediaDataController;
        this.f20207c = document;
    }

    @Override
    public final void run() {
        switch (this.f20205a) {
            case 0:
                this.f20206b.lambda$removeRecentGif$25(this.f20207c);
                return;
            default:
                this.f20206b.lambda$addRecentGif$26(this.f20207c);
                return;
        }
    }
}
