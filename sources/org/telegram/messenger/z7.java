package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class z7 implements Runnable {
    public final int f18043a;
    public final MediaDataController f18044b;
    public final TLRPC.Document f18045c;

    public z7(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f18043a = i10;
        this.f18044b = mediaDataController;
        this.f18045c = document;
    }

    @Override
    public final void run() {
        switch (this.f18043a) {
            case 0:
                this.f18044b.lambda$removeRecentGif$25(this.f18045c);
                return;
            default:
                this.f18044b.lambda$addRecentGif$26(this.f18045c);
                return;
        }
    }
}
