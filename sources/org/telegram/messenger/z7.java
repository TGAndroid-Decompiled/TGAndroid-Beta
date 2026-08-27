package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class z7 implements Runnable {

    public final int f22317a;

    public final MediaDataController f22318b;

    public final TLRPC.Document f22319c;

    public z7(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f22317a = i10;
        this.f22318b = mediaDataController;
        this.f22319c = document;
    }

    @Override
    public final void run() {
        switch (this.f22317a) {
            case 0:
                this.f22318b.lambda$removeRecentGif$25(this.f22319c);
                break;
            default:
                this.f22318b.lambda$addRecentGif$26(this.f22319c);
                break;
        }
    }
}
