package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class h implements Runnable {
    public final int f20223a;
    public final int f20224b;
    public final TLRPC.Updates f20225c;

    public h(int i10, TLRPC.Updates updates, int i11) {
        this.f20223a = i11;
        this.f20224b = i10;
        this.f20225c = updates;
    }

    @Override
    public final void run() {
        switch (this.f20223a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f20224b, this.f20225c);
                return;
            default:
                MessagesController.getInstance(this.f20224b).processUpdates(this.f20225c, false);
                return;
        }
    }
}
