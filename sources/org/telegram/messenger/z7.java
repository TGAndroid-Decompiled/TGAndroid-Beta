package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class z7 implements Runnable {
    public final int f18272a;
    public final MediaDataController f18273b;
    public final TLRPC.Document f18274c;

    public z7(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f18272a = i10;
        this.f18273b = mediaDataController;
        this.f18274c = document;
    }

    @Override
    public final void run() {
        switch (this.f18272a) {
            case 0:
                this.f18273b.lambda$removeRecentGif$25(this.f18274c);
                return;
            default:
                this.f18273b.lambda$addRecentGif$26(this.f18274c);
                return;
        }
    }
}
