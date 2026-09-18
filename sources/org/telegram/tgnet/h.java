package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class h implements Runnable {
    public final int f18480a;
    public final int f18481b;
    public final TLRPC.Updates f18482c;

    public h(int i10, TLRPC.Updates updates, int i11) {
        this.f18480a = i11;
        this.f18481b = i10;
        this.f18482c = updates;
    }

    @Override
    public final void run() {
        switch (this.f18480a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f18481b, this.f18482c);
                return;
            default:
                MessagesController.getInstance(this.f18481b).processUpdates(this.f18482c, false);
                return;
        }
    }
}
