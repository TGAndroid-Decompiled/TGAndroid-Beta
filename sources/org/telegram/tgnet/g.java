package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class g implements Runnable {
    public final int f22211a;
    public final int f22212b;
    public final TLRPC.Updates f22213c;

    public g(int i10, TLRPC.Updates updates, int i11) {
        this.f22211a = i11;
        this.f22212b = i10;
        this.f22213c = updates;
    }

    @Override
    public final void run() {
        switch (this.f22211a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f22212b, this.f22213c);
                return;
            default:
                MessagesController.getInstance(this.f22212b).lambda$processUpdates$379(this.f22213c, false);
                return;
        }
    }
}
