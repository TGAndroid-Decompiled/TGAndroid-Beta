package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class g implements Runnable {
    public final int f20454a;
    public final int f20455b;
    public final TLRPC.Updates f20456c;

    public g(int i10, TLRPC.Updates updates, int i11) {
        this.f20454a = i11;
        this.f20455b = i10;
        this.f20456c = updates;
    }

    @Override
    public final void run() {
        switch (this.f20454a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f20455b, this.f20456c);
                return;
            default:
                MessagesController.getInstance(this.f20455b).lambda$processUpdates$377(this.f20456c, false);
                return;
        }
    }
}
