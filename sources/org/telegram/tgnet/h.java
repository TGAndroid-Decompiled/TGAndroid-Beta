package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class h implements Runnable {
    public final int f20082a;
    public final int f20083b;
    public final TLRPC.Updates f20084c;

    public h(int i10, TLRPC.Updates updates, int i11) {
        this.f20082a = i11;
        this.f20083b = i10;
        this.f20084c = updates;
    }

    @Override
    public final void run() {
        switch (this.f20082a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f20083b, this.f20084c);
                return;
            default:
                MessagesController.getInstance(this.f20083b).processUpdates(this.f20084c, false);
                return;
        }
    }
}
