package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class g implements Runnable {
    public final int f21028a;
    public final int f21029b;
    public final TLRPC.Updates f21030c;

    public g(int i10, TLRPC.Updates updates, int i11) {
        this.f21028a = i11;
        this.f21029b = i10;
        this.f21030c = updates;
    }

    @Override
    public final void run() {
        switch (this.f21028a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f21029b, this.f21030c);
                return;
            default:
                MessagesController.getInstance(this.f21029b).processUpdates(this.f21030c, false);
                return;
        }
    }
}
