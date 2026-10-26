package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class g implements Runnable {
    public final int f22210a;
    public final int f22211b;
    public final TLRPC.Updates f22212c;

    public g(int i10, TLRPC.Updates updates, int i11) {
        this.f22210a = i11;
        this.f22211b = i10;
        this.f22212c = updates;
    }

    @Override
    public final void run() {
        switch (this.f22210a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f22211b, this.f22212c);
                return;
            default:
                MessagesController.getInstance(this.f22211b).lambda$processUpdates$379(this.f22212c, false);
                return;
        }
    }
}
