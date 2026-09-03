package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class g implements Runnable {
    public final int f19340a;
    public final int f19341b;
    public final TLRPC.Updates f19342c;

    public g(int i10, TLRPC.Updates updates, int i11) {
        this.f19340a = i11;
        this.f19341b = i10;
        this.f19342c = updates;
    }

    @Override
    public final void run() {
        switch (this.f19340a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f19341b, this.f19342c);
                return;
            default:
                MessagesController.getInstance(this.f19341b).processUpdates(this.f19342c, false);
                return;
        }
    }
}
