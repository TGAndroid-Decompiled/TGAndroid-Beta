package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class h implements Runnable {
    public final int f20228a;
    public final int f20229b;
    public final TLRPC.Updates f20230c;

    public h(int i10, TLRPC.Updates updates, int i11) {
        this.f20228a = i11;
        this.f20229b = i10;
        this.f20230c = updates;
    }

    @Override
    public final void run() {
        switch (this.f20228a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f20229b, this.f20230c);
                return;
            default:
                MessagesController.getInstance(this.f20229b).processUpdates(this.f20230c, false);
                return;
        }
    }
}
