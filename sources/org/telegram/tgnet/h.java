package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class h implements Runnable {
    public final int f18296a;
    public final int f18297b;
    public final TLRPC.Updates f18298c;

    public h(int i10, TLRPC.Updates updates, int i11) {
        this.f18296a = i11;
        this.f18297b = i10;
        this.f18298c = updates;
    }

    @Override
    public final void run() {
        switch (this.f18296a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f18297b, this.f18298c);
                return;
            default:
                MessagesController.getInstance(this.f18297b).processUpdates(this.f18298c, false);
                return;
        }
    }
}
