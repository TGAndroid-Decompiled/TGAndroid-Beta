package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class g implements Runnable {
    public final int f20460a;
    public final int f20461b;
    public final TLRPC.Updates f20462c;

    public g(int i10, TLRPC.Updates updates, int i11) {
        this.f20460a = i11;
        this.f20461b = i10;
        this.f20462c = updates;
    }

    @Override
    public final void run() {
        switch (this.f20460a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f20461b, this.f20462c);
                return;
            default:
                MessagesController.getInstance(this.f20461b).lambda$processUpdates$377(this.f20462c, false);
                return;
        }
    }
}
