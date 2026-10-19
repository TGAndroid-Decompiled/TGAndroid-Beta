package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class g implements Runnable {
    public final int f20456a;
    public final int f20457b;
    public final TLRPC.Updates f20458c;

    public g(int i10, TLRPC.Updates updates, int i11) {
        this.f20456a = i11;
        this.f20457b = i10;
        this.f20458c = updates;
    }

    @Override
    public final void run() {
        switch (this.f20456a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f20457b, this.f20458c);
                return;
            default:
                MessagesController.getInstance(this.f20457b).lambda$processUpdates$377(this.f20458c, false);
                return;
        }
    }
}
