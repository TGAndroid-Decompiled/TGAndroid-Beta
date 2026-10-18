package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class g implements Runnable {
    public final int f20453a;
    public final int f20454b;
    public final TLRPC.Updates f20455c;

    public g(int i10, TLRPC.Updates updates, int i11) {
        this.f20453a = i11;
        this.f20454b = i10;
        this.f20455c = updates;
    }

    @Override
    public final void run() {
        switch (this.f20453a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f20454b, this.f20455c);
                return;
            default:
                MessagesController.getInstance(this.f20454b).lambda$processUpdates$377(this.f20455c, false);
                return;
        }
    }
}
