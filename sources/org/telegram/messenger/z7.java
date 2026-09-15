package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class z7 implements Runnable {
    public final int f18046a;
    public final MediaDataController f18047b;
    public final TLRPC.Document f18048c;

    public z7(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f18046a = i10;
        this.f18047b = mediaDataController;
        this.f18048c = document;
    }

    @Override
    public final void run() {
        switch (this.f18046a) {
            case 0:
                this.f18047b.lambda$removeRecentGif$25(this.f18048c);
                return;
            default:
                this.f18047b.lambda$addRecentGif$26(this.f18048c);
                return;
        }
    }
}
