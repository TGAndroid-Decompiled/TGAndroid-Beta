package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class g implements Runnable {
    public final int f20457a;
    public final int f20458b;
    public final TLRPC.Updates f20459c;

    public g(int i10, TLRPC.Updates updates, int i11) {
        this.f20457a = i11;
        this.f20458b = i10;
        this.f20459c = updates;
    }

    @Override
    public final void run() {
        switch (this.f20457a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f20458b, this.f20459c);
                return;
            default:
                MessagesController.getInstance(this.f20458b).lambda$processUpdates$377(this.f20459c, false);
                return;
        }
    }
}
