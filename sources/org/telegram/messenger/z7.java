package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class z7 implements Runnable {
    public final int f19797a;
    public final MediaDataController f19798b;
    public final TLRPC.Document f19799c;

    public z7(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f19797a = i10;
        this.f19798b = mediaDataController;
        this.f19799c = document;
    }

    @Override
    public final void run() {
        switch (this.f19797a) {
            case 0:
                this.f19798b.lambda$removeRecentGif$25(this.f19799c);
                return;
            default:
                this.f19798b.lambda$addRecentGif$26(this.f19799c);
                return;
        }
    }
}
