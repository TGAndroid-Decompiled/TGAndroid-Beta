package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class h implements Runnable {
    public final int f18519a;
    public final int f18520b;
    public final TLRPC.Updates f18521c;

    public h(int i10, TLRPC.Updates updates, int i11) {
        this.f18519a = i11;
        this.f18520b = i10;
        this.f18521c = updates;
    }

    @Override
    public final void run() {
        switch (this.f18519a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f18520b, this.f18521c);
                return;
            default:
                MessagesController.getInstance(this.f18520b).processUpdates(this.f18521c, false);
                return;
        }
    }
}
