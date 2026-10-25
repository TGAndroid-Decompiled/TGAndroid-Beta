package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class g implements Runnable {
    public final int f22208a;
    public final int f22209b;
    public final TLRPC.Updates f22210c;

    public g(int i10, TLRPC.Updates updates, int i11) {
        this.f22208a = i11;
        this.f22209b = i10;
        this.f22210c = updates;
    }

    @Override
    public final void run() {
        switch (this.f22208a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f22209b, this.f22210c);
                return;
            default:
                MessagesController.getInstance(this.f22209b).lambda$processUpdates$379(this.f22210c, false);
                return;
        }
    }
}
