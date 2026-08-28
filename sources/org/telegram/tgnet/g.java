package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class g implements Runnable {
    public final int f22563a;
    public final int f22564b;
    public final TLRPC.Updates f22565c;

    public g(int i9, TLRPC.Updates updates, int i10) {
        this.f22563a = i10;
        this.f22564b = i9;
        this.f22565c = updates;
    }

    @Override
    public final void run() {
        switch (this.f22563a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f22564b, this.f22565c);
                return;
            default:
                MessagesController.getInstance(this.f22564b).processUpdates(this.f22565c, false);
                return;
        }
    }
}
