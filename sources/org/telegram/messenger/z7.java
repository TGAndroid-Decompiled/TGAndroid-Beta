package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class z7 implements Runnable {
    public final int f18273a;
    public final MediaDataController f18274b;
    public final TLRPC.Document f18275c;

    public z7(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f18273a = i10;
        this.f18274b = mediaDataController;
        this.f18275c = document;
    }

    @Override
    public final void run() {
        switch (this.f18273a) {
            case 0:
                this.f18274b.lambda$removeRecentGif$25(this.f18275c);
                return;
            default:
                this.f18274b.lambda$addRecentGif$26(this.f18275c);
                return;
        }
    }
}
