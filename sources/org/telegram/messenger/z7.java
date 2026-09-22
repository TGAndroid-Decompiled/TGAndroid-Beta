package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class z7 implements Runnable {
    public final int f18287a;
    public final MediaDataController f18288b;
    public final TLRPC.Document f18289c;

    public z7(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f18287a = i10;
        this.f18288b = mediaDataController;
        this.f18289c = document;
    }

    @Override
    public final void run() {
        switch (this.f18287a) {
            case 0:
                this.f18288b.lambda$removeRecentGif$25(this.f18289c);
                return;
            default:
                this.f18288b.lambda$addRecentGif$26(this.f18289c);
                return;
        }
    }
}
