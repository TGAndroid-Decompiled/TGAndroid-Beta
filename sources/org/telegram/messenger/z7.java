package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class z7 implements Runnable {
    public final int f18055a;
    public final MediaDataController f18056b;
    public final TLRPC.Document f18057c;

    public z7(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f18055a = i10;
        this.f18056b = mediaDataController;
        this.f18057c = document;
    }

    @Override
    public final void run() {
        switch (this.f18055a) {
            case 0:
                this.f18056b.lambda$removeRecentGif$25(this.f18057c);
                return;
            default:
                this.f18056b.lambda$addRecentGif$26(this.f18057c);
                return;
        }
    }
}
