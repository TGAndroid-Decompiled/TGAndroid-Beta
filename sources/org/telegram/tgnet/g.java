package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class g implements Runnable {
    public final int f19365a;
    public final int f19366b;
    public final TLRPC.Updates f19367c;

    public g(int i10, TLRPC.Updates updates, int i11) {
        this.f19365a = i11;
        this.f19366b = i10;
        this.f19367c = updates;
    }

    @Override
    public final void run() {
        switch (this.f19365a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f19366b, this.f19367c);
                return;
            default:
                MessagesController.getInstance(this.f19366b).processUpdates(this.f19367c, false);
                return;
        }
    }
}
