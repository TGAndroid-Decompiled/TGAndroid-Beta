package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class h implements Runnable {
    public final int f18305a;
    public final int f18306b;
    public final TLRPC.Updates f18307c;

    public h(int i10, TLRPC.Updates updates, int i11) {
        this.f18305a = i11;
        this.f18306b = i10;
        this.f18307c = updates;
    }

    @Override
    public final void run() {
        switch (this.f18305a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f18306b, this.f18307c);
                return;
            default:
                MessagesController.getInstance(this.f18306b).processUpdates(this.f18307c, false);
                return;
        }
    }
}
