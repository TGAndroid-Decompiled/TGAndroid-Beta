package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class h implements Runnable {
    public final int f18267a;
    public final int f18268b;
    public final TLRPC.Updates f18269c;

    public h(int i10, TLRPC.Updates updates, int i11) {
        this.f18267a = i11;
        this.f18268b = i10;
        this.f18269c = updates;
    }

    @Override
    public final void run() {
        switch (this.f18267a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f18268b, this.f18269c);
                return;
            default:
                MessagesController.getInstance(this.f18268b).processUpdates(this.f18269c, false);
                return;
        }
    }
}
