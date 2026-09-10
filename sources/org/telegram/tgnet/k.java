package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class k implements Runnable {
    public final int f17387a;
    public final int f17388b;
    public final TLRPC.Updates f17389c;

    public k(int i10, TLRPC.Updates updates, int i11) {
        this.f17387a = i11;
        this.f17388b = i10;
        this.f17389c = updates;
    }

    @Override
    public final void run() {
        switch (this.f17387a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f17388b, this.f17389c);
                return;
            default:
                MessagesController.getInstance(this.f17388b).processUpdates(this.f17389c, false);
                return;
        }
    }
}
