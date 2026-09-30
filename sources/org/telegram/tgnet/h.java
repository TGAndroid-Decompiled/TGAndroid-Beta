package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class h implements Runnable {
    public final int f18536a;
    public final int f18537b;
    public final TLRPC.Updates f18538c;

    public h(int i10, TLRPC.Updates updates, int i11) {
        this.f18536a = i11;
        this.f18537b = i10;
        this.f18538c = updates;
    }

    @Override
    public final void run() {
        switch (this.f18536a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f18537b, this.f18538c);
                return;
            default:
                MessagesController.getInstance(this.f18537b).processUpdates(this.f18538c, false);
                return;
        }
    }
}
