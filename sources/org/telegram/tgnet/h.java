package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class h implements Runnable {
    public final int f18505a;
    public final int f18506b;
    public final TLRPC.Updates f18507c;

    public h(int i10, TLRPC.Updates updates, int i11) {
        this.f18505a = i11;
        this.f18506b = i10;
        this.f18507c = updates;
    }

    @Override
    public final void run() {
        switch (this.f18505a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f18506b, this.f18507c);
                return;
            default:
                MessagesController.getInstance(this.f18506b).processUpdates(this.f18507c, false);
                return;
        }
    }
}
