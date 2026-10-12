package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class i implements Runnable {
    public final int f19992a;
    public final int f19993b;
    public final TLRPC.Updates f19994c;

    public i(int i10, TLRPC.Updates updates, int i11) {
        this.f19992a = i11;
        this.f19993b = i10;
        this.f19994c = updates;
    }

    @Override
    public final void run() {
        switch (this.f19992a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f19993b, this.f19994c);
                return;
            default:
                MessagesController.getInstance(this.f19993b).lambda$processUpdates$377(this.f19994c, false);
                return;
        }
    }
}
