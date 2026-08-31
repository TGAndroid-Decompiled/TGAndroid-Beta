package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class g implements Runnable {
    public final int f21026a;
    public final int f21027b;
    public final TLRPC.Updates f21028c;

    public g(int i10, TLRPC.Updates updates, int i11) {
        this.f21026a = i11;
        this.f21027b = i10;
        this.f21028c = updates;
    }

    @Override
    public final void run() {
        switch (this.f21026a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f21027b, this.f21028c);
                return;
            default:
                MessagesController.getInstance(this.f21027b).processUpdates(this.f21028c, false);
                return;
        }
    }
}
