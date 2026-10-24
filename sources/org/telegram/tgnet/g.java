package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class g implements Runnable {
    public final int f20525a;
    public final int f20526b;
    public final TLRPC.Updates f20527c;

    public g(int i10, TLRPC.Updates updates, int i11) {
        this.f20525a = i11;
        this.f20526b = i10;
        this.f20527c = updates;
    }

    @Override
    public final void run() {
        switch (this.f20525a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f20526b, this.f20527c);
                return;
            default:
                MessagesController.getInstance(this.f20526b).lambda$processUpdates$377(this.f20527c, false);
                return;
        }
    }
}
