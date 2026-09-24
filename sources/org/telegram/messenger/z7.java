package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class z7 implements Runnable {
    public final int f18265a;
    public final MediaDataController f18266b;
    public final TLRPC.Document f18267c;

    public z7(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f18265a = i10;
        this.f18266b = mediaDataController;
        this.f18267c = document;
    }

    @Override
    public final void run() {
        switch (this.f18265a) {
            case 0:
                this.f18266b.lambda$removeRecentGif$25(this.f18267c);
                return;
            default:
                this.f18266b.lambda$addRecentGif$26(this.f18267c);
                return;
        }
    }
}
