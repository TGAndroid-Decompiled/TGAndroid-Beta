package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class i implements Runnable {
    public final int f19991a;
    public final int f19992b;
    public final TLRPC.Updates f19993c;

    public i(int i10, TLRPC.Updates updates, int i11) {
        this.f19991a = i11;
        this.f19992b = i10;
        this.f19993c = updates;
    }

    @Override
    public final void run() {
        switch (this.f19991a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f19992b, this.f19993c);
                return;
            default:
                MessagesController.getInstance(this.f19992b).lambda$processUpdates$377(this.f19993c, false);
                return;
        }
    }
}
