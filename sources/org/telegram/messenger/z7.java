package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class z7 implements Runnable {
    public final int f19824a;
    public final MediaDataController f19825b;
    public final TLRPC.Document f19826c;

    public z7(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f19824a = i10;
        this.f19825b = mediaDataController;
        this.f19826c = document;
    }

    @Override
    public final void run() {
        switch (this.f19824a) {
            case 0:
                this.f19825b.lambda$removeRecentGif$25(this.f19826c);
                return;
            default:
                this.f19825b.lambda$addRecentGif$26(this.f19826c);
                return;
        }
    }
}
