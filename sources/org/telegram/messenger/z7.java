package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class z7 implements Runnable {
    public final int f20202a;
    public final MediaDataController f20203b;
    public final TLRPC.Document f20204c;

    public z7(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f20202a = i10;
        this.f20203b = mediaDataController;
        this.f20204c = document;
    }

    @Override
    public final void run() {
        switch (this.f20202a) {
            case 0:
                this.f20203b.lambda$removeRecentGif$25(this.f20204c);
                return;
            default:
                this.f20203b.lambda$addRecentGif$26(this.f20204c);
                return;
        }
    }
}
