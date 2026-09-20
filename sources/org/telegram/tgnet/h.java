package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class h implements Runnable {
    public final int f18512a;
    public final int f18513b;
    public final TLRPC.Updates f18514c;

    public h(int i10, TLRPC.Updates updates, int i11) {
        this.f18512a = i11;
        this.f18513b = i10;
        this.f18514c = updates;
    }

    @Override
    public final void run() {
        switch (this.f18512a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f18513b, this.f18514c);
                return;
            default:
                MessagesController.getInstance(this.f18513b).processUpdates(this.f18514c, false);
                return;
        }
    }
}
