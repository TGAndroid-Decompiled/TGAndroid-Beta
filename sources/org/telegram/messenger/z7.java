package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class z7 implements Runnable {
    public final int f18229a;
    public final MediaDataController f18230b;
    public final TLRPC.Document f18231c;

    public z7(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f18229a = i10;
        this.f18230b = mediaDataController;
        this.f18231c = document;
    }

    @Override
    public final void run() {
        switch (this.f18229a) {
            case 0:
                this.f18230b.lambda$removeRecentGif$25(this.f18231c);
                return;
            default:
                this.f18230b.lambda$addRecentGif$26(this.f18231c);
                return;
        }
    }
}
