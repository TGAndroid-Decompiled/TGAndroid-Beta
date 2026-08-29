package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class g implements Runnable {
    public final int f22575a;
    public final int f22576b;
    public final TLRPC.Updates f22577c;

    public g(int i10, TLRPC.Updates updates, int i11) {
        this.f22575a = i11;
        this.f22576b = i10;
        this.f22577c = updates;
    }

    @Override
    public final void run() {
        switch (this.f22575a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f22576b, this.f22577c);
                return;
            default:
                MessagesController.getInstance(this.f22576b).processUpdates(this.f22577c, false);
                return;
        }
    }
}
