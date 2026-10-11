package org.telegram.tgnet;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class h implements Runnable {
    public final int f20218a;
    public final int f20219b;
    public final TLRPC.Updates f20220c;

    public h(int i10, TLRPC.Updates updates, int i11) {
        this.f20218a = i11;
        this.f20219b = i10;
        this.f20220c = updates;
    }

    @Override
    public final void run() {
        switch (this.f20218a) {
            case 0:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(this.f20219b, this.f20220c);
                return;
            default:
                MessagesController.getInstance(this.f20219b).lambda$processUpdates$377(this.f20220c, false);
                return;
        }
    }
}
