package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class z7 implements Runnable {
    public final int f18031a;
    public final MediaDataController f18032b;
    public final TLRPC.Document f18033c;

    public z7(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f18031a = i10;
        this.f18032b = mediaDataController;
        this.f18033c = document;
    }

    @Override
    public final void run() {
        switch (this.f18031a) {
            case 0:
                this.f18032b.lambda$removeRecentGif$25(this.f18033c);
                return;
            default:
                this.f18032b.lambda$addRecentGif$26(this.f18033c);
                return;
        }
    }
}
