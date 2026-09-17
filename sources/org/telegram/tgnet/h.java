package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class h implements Runnable {
    public final int f20055a;
    public final int f20056b;
    public final TLRPC.Updates f20057c;

    public h(int i10, TLRPC.Updates updates, int i11) {
        this.f20055a = i11;
        this.f20056b = i10;
        this.f20057c = updates;
    }

    @Override
    public final void run() {
        switch (this.f20055a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f20056b, this.f20057c);
                return;
            default:
                MessagesController.getInstance(this.f20056b).processUpdates(this.f20057c, false);
                return;
        }
    }
}
