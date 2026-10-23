package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class g implements Runnable {
    public final int f20524a;
    public final int f20525b;
    public final TLRPC.Updates f20526c;

    public g(int i10, TLRPC.Updates updates, int i11) {
        this.f20524a = i11;
        this.f20525b = i10;
        this.f20526c = updates;
    }

    @Override
    public final void run() {
        switch (this.f20524a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f20525b, this.f20526c);
                return;
            default:
                MessagesController.getInstance(this.f20525b).lambda$processUpdates$377(this.f20526c, false);
                return;
        }
    }
}
